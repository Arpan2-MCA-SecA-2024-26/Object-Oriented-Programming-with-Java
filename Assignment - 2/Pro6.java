//6. Write a Java program to multiply two matrices.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter rows and columns of matrix 1: ");
 int r1 = sc.nextInt(), c1 = sc.nextInt();
 System.out.println("Enter rows and columns of matrix 2: ");
 int r2 = sc.nextInt(), c2 = sc.nextInt();
 if (c1 != r2) {
 System.out.println("Matrix multiplication not possible!");
 return;
 }
 int[][] mat1 = new int[r1][c1];
 int[][] mat2 = new int[r2][c2];
 int[][] product = new int[r1][c2];
 System.out.println("Enter elements of matrix 1: ");
 for (int i = 0; i < r1; i++) {
 for (int j = 0; j < c1; j++) {
 mat1[i][j] = sc.nextInt();
 }
 }
 System.out.println("Enter elements of matrix 2: ");
 for (int i = 0; i < r2; i++) {
 for (int j = 0; j < c2; j++) {
 mat2[i][j] = sc.nextInt();
 }
 }
 for (int i = 0; i < r1; i++) {
 for (int j = 0; j < c2; j++) {
 for (int k = 0; k < c1; k++) {
 product[i][j] += mat1[i][k] * mat2[k][j];
 }
 }
 }
 System.out.println("Product of matrices: ");
 for (int i = 0; i < r1; i++) {
 for (int j = 0; j < c2; j++) {
 System.out.print(product[i][j] + " ");
 }
 System.out.println();
 }
 }
}
