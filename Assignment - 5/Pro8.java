//8. Implementation of dynamic method dispatch in java.

class Parent {
 void show() {
 System.out.println("Parent class method");
 }
}
class Child extends Parent {
 void show() {
 System.out.println("Child class method");
 }
}
public class Main {
 public static void main(String[] args) {
 Parent obj = new Child();
 obj.show();
 }
}