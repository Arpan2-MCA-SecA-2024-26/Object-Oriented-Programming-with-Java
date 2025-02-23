//5. Write a java program to implement the multilevel inheritance in java.

class GrandParent {
 void show() {
 System.out.println("This is the Grandparent class");
 }
}
class Parent extends GrandParent {
 void display() {
 System.out.println("This is the Parent class");
 }
}
class Child extends Parent {
 void print() {
 System.out.println("This is the Child class");
 }
}
public class Main {
 public static void main(String[] args) {
 Child obj = new Child();
 obj.show();
 obj.display();
 obj.print();
 }
}