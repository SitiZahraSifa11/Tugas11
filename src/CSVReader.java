import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "D:\\siti zahra sifa\\Semester4\\PBO\\Tugas11\\students.csv"; 
        String line;
        String csvSplitBy = ",";
        int indeks = 0;
        int jumlahBrs=0;


        System.out.println("NIM, NAMA, UMUR, PRODI");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
                if (indeks > 1) { 
                    String[] student = line.split(csvSplitBy);
                    if (student.length >= 4) {
                        System.out.println(student[0] + ", " + student[1] + ", " + student[2] + ", " + student[3]);
                        jumlahBrs++;
                    }
                }
            }
            System.out.println("Jumlah baris pada file tersebut : "+jumlahBrs);
        } catch (IOException e) {
           System.err.println("Gagal membaca file: " + csvFile);
           System.err.println("Pesan error: " + e.getMessage());
        }
    }
}
