package iofile;
import java.io.*;

public class Bai12 {

	public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("E:/WorkSpace/io/hihi.txt"));
             while (line != null)
             {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(line);
            }
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }

}
