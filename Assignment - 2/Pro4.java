//4. Write a Java program to calculate Sum of two 2-dimensional arrays

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter rows and columns: ");
 int rows = sc.nextInt();
 int cols = sc.nextInt();
 int[][] arr1 = new int[rows][cols];
 int[][] arr2 = new int[rows][cols];
 int[][] sum = new int[rows][cols];
 System.out.println("Enter elements of first array: ");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 arr1[i][j] = sc.nextInt();
 }
 }
 System.out.println("Enter elements of second array: ");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 arr2[i][j] = sc.nextInt();
 }
 }
 System.out.println("Sum of arrays: ");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 sum[i][j] = arr1[i][j] + arr2[i][j];
 System.out.print(sum[i][j] + " ");
 }
 System.out.println();
 }
 }
}