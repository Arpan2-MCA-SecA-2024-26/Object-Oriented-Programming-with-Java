//4. Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num = sc.nextInt();
 int temp = num, rev = 0;
 while (temp != 0) {
 rev = rev * 10 + temp % 10;
 temp /= 10;
 }
 if (num == rev) {
 System.out.println(num + " is a Palindrome");
 } else {
 System.out.println(num + " is not a Palindrome");
 }
 }
}