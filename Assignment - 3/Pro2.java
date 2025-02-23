//2. Write a java program to take input from keyboard using Scanner class.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter your age: ");
 int age = sc.nextInt();
 System.out.println("Your age is: " + age);
 }
}