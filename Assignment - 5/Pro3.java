//3. Write a java program to implement the single inheritance in java.

class Parent {
 void show() {
 System.out.println("This is the Parent class");
 }
}
class Child extends Parent {
 void display() {
 System.out.println("This is the Child class");
 }
}
public class Main {
 public static void main(String[] args) {
 Child obj = new Child();
 obj.show();
 obj.display();
 }
}