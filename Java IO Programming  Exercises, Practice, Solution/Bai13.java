package iofile;
import java.io.*;
import java.util.*;
public class Bai13 {

	public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String line = "";
        String sdata = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("E:/WorkSpace/io/hihi.txt"));
             while (line != null)
             {
                if (line == null)
                  break;
                sdata += line;
                line = br.readLine();
                
            }
              System.out.println(sdata);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }

}
