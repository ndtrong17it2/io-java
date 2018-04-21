package iofile;
import java.io.*;
import java.util.*;
public class Bai14 {

	public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String line = "";
        List<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("E:/WorkSpace/io/hihi.txt"));
              while (line != null)
               {
                line = br.readLine();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                if (line==null)
                   break;
                list.add(line);
            }
         System.out.println(Arrays.toString(list.toArray()));
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}
