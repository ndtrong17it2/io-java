package iofile;
import java.io.*;

public class Bai4 {

	public static void main(String[] args) {
		File file=new File("E:/WorkSpace/io");
		if (file.canRead()) {
			System.out.println("Read permission!");
		}
		if (file.canWrite()) {
			System.out.println("Write permission!");
		}
	}

}
