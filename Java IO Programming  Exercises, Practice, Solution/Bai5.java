package iofile;
import java.io.*;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("E:/WorkSpace/io/hihi.txt");
		if(file.isDirectory()) {
			System.out.println("File is Directory !");
		}else {
			System.out.println("File is a file !");
		}
	}

}
