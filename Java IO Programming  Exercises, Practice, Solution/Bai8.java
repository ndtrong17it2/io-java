package iofile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 public class Bai8 {
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input: ");
    String name = br.readLine();
    System.out.println("Output: " + name);
  }
}
