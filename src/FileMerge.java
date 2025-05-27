import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {
    public static void main(String[] args) {
        String[] files = {
            "D:\\siti zahra sifa\\Semester4\\PBO\\Tugas11\\file1.txt",
            "D:\\siti zahra sifa\\Semester4\\PBO\\Tugas11\\file2.txt"
        };
        String mergedFile = "D:\\siti zahra sifa\\Semester4\\PBO\\Tugas11\\merge.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Gagal membaca file: " + file);
                    e.printStackTrace();
                }
            }
            System.out.println("File berhasil digabung ke: " + mergedFile);
        } catch (IOException e) {
            System.err.println("Gagal menulis file hasil merge.");
            e.printStackTrace();
        }
    }
}
