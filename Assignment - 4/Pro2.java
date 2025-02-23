//2. Write a java program to implement of constructor overloading.

import java.util.Scanner;
class ConstructorOverloading {
 int num;
 String name;
 ConstructorOverloading() {
 this.num = 0;
 this.name = "Default";
 }
 ConstructorOverloading(int num) {
 this.num = num;
 this.name = "Unknown";
 }
 ConstructorOverloading(int num, String name) {
 this.num = num;
 this.name = name;
 }
 void display() {
 System.out.println("Number: " + num + ", Name: " + name);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num = sc.nextInt();
 sc.nextLine();
 System.out.print("Enter a name: ");
 String name = sc.nextLine();
 ConstructorOverloading obj1 = new
ConstructorOverloading();
 ConstructorOverloading obj2 = new
ConstructorOverloading(num);
 ConstructorOverloading obj3 = new
ConstructorOverloading(num, name);
 obj1.display();
 obj2.display();
 obj3.display();
 }
}