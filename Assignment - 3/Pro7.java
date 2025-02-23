//7. Write a Java program to check whether a given number is Armstrong Number or not.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num = sc.nextInt();
 int temp = num, sum = 0, digits = 0;
 while (temp != 0) {
 temp /= 10;
 digits++;
 }
 temp = num;
 while (temp != 0) {
 int digit = temp % 10;
 sum += Math.pow(digit, digits);
 temp /= 10;
 }
 if (sum == num) {
 System.out.println(num + " is an Armstrong number");
 } else {
 System.out.println(num + " is not an Armstrong number");
 }
 }
}