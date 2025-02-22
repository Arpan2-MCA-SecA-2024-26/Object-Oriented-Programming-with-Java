//2. Write a java program to create 2D array and access the array element.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter rows and columns: ");
 int rows = sc.nextInt();
 int cols = sc.nextInt();
 int[][] arr = new int[rows][cols];
 System.out.println("Enter array elements: ");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 arr[i][j] = sc.nextInt();
 }
 }
 System.out.println("Array elements are: ");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 System.out.print(arr[i][j] + " ");
 }
 System.out.println();
 }
 }
}