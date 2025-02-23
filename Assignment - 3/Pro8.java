//8. Write a Java program to calculate the sum of natural numbers up to a certain range.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a range: ");
 int n = sc.nextInt();
 int sum = (n * (n + 1)) / 2;
 System.out.println("Sum of first " + n + " natural numbers: " +
sum);
 }
}