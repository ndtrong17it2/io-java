package iofile;
import java.io.*;
import java.util.*;
public class Bai15 {

	public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String line = "";
        try
          {
             String filename= "E:/WorkSpace/io/hihi.txt";
             FileWriter fw = new FileWriter(filename,false); 
             fw.write("Python Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("E:/WorkSpace/io/hihi.txt"));
             while (line != null)
             {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(line);
            }
             br.close();                          
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
}
