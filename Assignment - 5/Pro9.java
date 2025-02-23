//9. Write a java program to stop method overriding.

class Parent {
 final void show() {
 System.out.println("This method cannot be overridden");
 }
}
class Child extends Parent {
 // void show() {} // This will give a compilation error
}
public class Main {
 public static void main(String[] args) {
 Child obj = new Child();
 obj.show();
 }
}