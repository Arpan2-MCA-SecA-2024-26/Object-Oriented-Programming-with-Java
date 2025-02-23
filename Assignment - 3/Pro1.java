//1. Write a java program to implement BufferedReader class.

import java.io.*;
public class Main {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
 System.out.print("Enter your name: ");
 String name = br.readLine();
 System.out.println("Hello, " + name);
 }
}