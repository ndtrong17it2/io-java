package iofile;
import java.io.*;

public class Bai1 {

	public static void main(String[] args) {
		File file=new File("E:/WorkSpace/io");
		String[] listFile=file.list();
		for(int i=0;i<listFile.length;i++)
		{
			System.out.println(listFile[i]);
			
		}
	}

}
