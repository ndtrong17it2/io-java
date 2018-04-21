package iofile;
import java.io.*;
public class Bai2 {

	public static void main(String[] args) {
		File file=new File("E:/WorkSpace/io");
		FilenameFilter filter=new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".txt"))
				{
					return true;
				}
				else return false;
			}
		};
		String[] listFile=file.list(filter);
		for(String name:listFile)
		{
			System.out.println(name);
		}
	}
}
