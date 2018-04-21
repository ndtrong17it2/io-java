package iofile;
import java.io.*;
import java.util.Date;

public class Bai7 {

	public static void main(String[] args) {
		File file=new File("E:/WorkSpace/io/hihi.txt");
		System.out.println("Last time modified: "+new Date(file.lastModified()));
	}

}
