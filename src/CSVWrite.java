import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CSVWrite {
    public static void main(String[] args) {
        String csvFile = "D:\\siti zahra sifa\\Semester4\\PBO\\Tugas11\\students.csv";
        Scanner sc=new Scanner(System.in);


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile,true))) {
            boolean lanjut=true;
            while(lanjut){
                System.out.println("===Masukan Data Mahasiwa yang Akan Ditambahkan==== ");
                System.out.println("NIM : ");
                String nim =sc.nextLine();

                System.out.println("Nama : ");
                String nama = sc.nextLine();

                System.out.println("Umur : ");
                String umur=sc.nextLine();

                System.out.println("Prodi : ");
                String prodi =sc.nextLine();

                String line = nim+","+nama+","+umur+","+prodi;
                bw.write(line);
                bw.newLine();

                System.out.println("Apakah akan menambah lagi? (y/n):");
                String jawab= sc.nextLine().trim().toLowerCase();
                if(!jawab.equals("y")){
                    lanjut=false;
                }
            }
            System.out.println("Data berhasil ditambahkan ke Students.csv.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
