package iofile;
import java.io.*;

public class Bai11 {

	public static void main(String a[]){
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader( new FileReader("E:/WorkSpace/io/hihi.txt"));
            while( (line = br.readLine()) != null){
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
