//7. Implementation of method overriding in java.

class Parent {
 void display() {
 System.out.println("Parent class method");
 }
}
class Child extends Parent {
 @Override
 void display() {
 System.out.println("Overridden method in Child class");
 }
}
public class Main {
 public static void main(String[] args) {
 Child obj = new Child();
 obj.display();
 }
}