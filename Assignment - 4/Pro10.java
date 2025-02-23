//10. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override these two methods in each of the derived classes to calculate the volumeand whole surface area of each type of three-dimensional objects. The dimensions of the objects are to be taken from the users and passed through the respective constructors of each derived class. Write a main method to test these classes.

import java.util.Scanner;
// Abstract base class
abstract class ThreeDObject {
 abstract double wholeSurfaceArea();
 abstract double volume();
}
// Derived class for Box
class Box extends ThreeDObject {
 double length, width, height;
 // Constructor to take user input
 Box(double length, double width, double height) {
 this.length = length;
 this.width = width;
 this.height = height;
 }
 @Override
 double wholeSurfaceArea() {
 return 2 * (length * width + width * height + height * length);
 }
 @Override
 double volume() {
 return length * width * height;
 }
}
// Derived class for Cube
class Cube extends ThreeDObject {
 double side;
 // Constructor
 Cube(double side) {
 this.side = side;
 }
 @Override
 double wholeSurfaceArea() {
 return 6 * side * side;
 }
 @Override
 double volume() {
 return side * side * side;
 }
}
// Derived class for Cylinder
class Cylinder extends ThreeDObject {
 double radius, height;
 // Constructor
 Cylinder(double radius, double height) {
 this.radius = radius;
 this.height = height;
 }
 @Override
 double wholeSurfaceArea() {
 return 2 * Math.PI * radius * (radius + height);
 }
 @Override
 double volume() {
 return Math.PI * radius * radius * height;
 }
}
// Derived class for Cone
class Cone extends ThreeDObject {
 double radius, height;
 // Constructor
 Cone(double radius, double height) {
 this.radius = radius;
 this.height = height;
 }
 @Override
 double wholeSurfaceArea() {
 double slantHeight = Math.sqrt(radius * radius + height *
height);
 return Math.PI * radius * (radius + slantHeight);
 }
 @Override
 double volume() {
 return (1.0 / 3) * Math.PI * radius * radius * height;
 }
}
// Main class
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 // Taking input for Box
 System.out.print("Enter length, width, and height of Box: ");
 double l = sc.nextDouble(), w = sc.nextDouble(), h =
sc.nextDouble();
 Box box = new Box(l, w, h);
 System.out.println("Box Surface Area: " +
box.wholeSurfaceArea());
 System.out.println("Box Volume: " + box.volume());
 // Taking input for Cube
 System.out.print("\nEnter side of Cube: ");
 double s = sc.nextDouble();
 Cube cube = new Cube(s);
 System.out.println("Cube Surface Area: " +
cube.wholeSurfaceArea());
 System.out.println("Cube Volume: " + cube.volume());
 // Taking input for Cylinder
 System.out.print("\nEnter radius and height of Cylinder: ");
 double r1 = sc.nextDouble(), h1 = sc.nextDouble();
 Cylinder cylinder = new Cylinder(r1, h1);
 System.out.println("Cylinder Surface Area: " +
cylinder.wholeSurfaceArea());
 System.out.println("Cylinder Volume: " + cylinder.volume());
 // Taking input for Cone
 System.out.print("\nEnter radius and height of Cone: ");
 double r2 = sc.nextDouble(), h2 = sc.nextDouble();
 Cone cone = new Cone(r2, h2);
 System.out.println("Cone Surface Area: " +
cone.wholeSurfaceArea());
 System.out.println("Cone Volume: " + cone.volume());
 sc.close();
 }
}