//1. Write a java program to create a simple array and access array element.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter size of array: ");
 int n = sc.nextInt();
 int[] arr = new int[n];
 System.out.println("Enter array elements: ");
 for (int i = 0; i < n; i++) {
 arr[i] = sc.nextInt();
 }
 System.out.println("Array elements are: ");
 for (int i = 0; i < n; i++) {
 System.out.println(arr[i]);
 }
 }
}