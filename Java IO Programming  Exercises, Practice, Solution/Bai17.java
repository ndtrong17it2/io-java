package iofile;
import java.io.*;
import java.util.*;
public class Bai17 {

	public static void main(String a[]){
        BufferedReader br = null;
        String line = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("E:/WorkSpace/io/hihi.txt"), "UTF-8"));
             while (((line = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(line);
            }
           reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }

}
