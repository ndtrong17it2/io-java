package iofile;
import java.io.*;
import java.util.*;
public class Bai18 {

	public static void main(String [ ] args) throws FileNotFoundException {
        new Bai18().findLongestWords();
   }

	public String findLongestWords() throws FileNotFoundException {

		String longest_word = "";
		String current;
		Scanner sc = new Scanner(new File("E:/WorkSpace/io/hihi.txt"));


		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longest_word.length()) {
				longest_word = current;
			}

		}
		System.out.println("\n"+longest_word+"\n");
		return longest_word;
	}
}
