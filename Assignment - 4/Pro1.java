//1. Implementation of method overloading with respect to parameter number, parameter data type.

import java.util.Scanner;
class MethodOverloading {
 void add(int a, int b) {
 System.out.println("Sum (2 numbers): " + (a + b));
 }
 void add(int a, int b, int c) {
 System.out.println("Sum (3 numbers): " + (a + b + c));
 }
 void add(double a, double b) {
 System.out.println("Sum (double values): " + (a + b));
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 MethodOverloading obj = new MethodOverloading();
 System.out.print("Enter two integers: ");
 int x = sc.nextInt(), y = sc.nextInt();
 obj.add(x, y);
 System.out.print("Enter three integers: ");
 int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
 obj.add(p, q, r);
 System.out.print("Enter two decimal numbers: ");
 double d1 = sc.nextDouble(), d2 = sc.nextDouble();
 obj.add(d1, d2);
 }
}