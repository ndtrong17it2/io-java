package iofile;

import java.io.*;

public class Bai10 { 
  public static void main(String a[]){       
        String file_name = "E:/WorkSpace/io/hihi.txt";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = inputStream.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(inputStream != null) inputStream.close();
            } catch(Exception ex){
                 
            }
        }
    }
}
