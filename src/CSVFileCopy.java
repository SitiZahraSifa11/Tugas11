import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
public class CSVFileCopy {
    public static void main(String[] args) {
        String fileAwal="Students.csv";
        String fileTujuan ="Students_copy.csv";

        try(BufferedReader br=new BufferedReader(new FileReader(fileAwal));
            BufferedWriter bw=new BufferedWriter(new FileWriter(fileTujuan))){
                String line;
                while((line=br.readLine())!=null){
                    bw.write(line);
                    bw.newLine();
                }          
                  System.out.println("File berhasil disalin ke " + fileTujuan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
