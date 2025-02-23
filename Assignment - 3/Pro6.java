//6. Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a binary number: ");
 String binary = sc.next();
 int decimal = Integer.parseInt(binary, 2);
 System.out.println("Decimal equivalent: " + decimal);
 System.out.print("Enter a decimal number: ");
 int dec = sc.nextInt();
 String bin = Integer.toBinaryString(dec);
 System.out.println("Binary equivalent: " + bin);
 }
}