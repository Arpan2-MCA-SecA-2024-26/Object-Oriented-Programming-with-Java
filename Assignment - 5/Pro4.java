//4. Write a java program to implement the hierarchical inheritance in java.

class Parent {
 void show() {
 System.out.println("This is the Parent class");
 }
}
class Child1 extends Parent {
 void display1() {
 System.out.println("This is Child1 class");
 }
}
class Child2 extends Parent {
 void display2() {
 System.out.println("This is Child2 class");
 }
}
public class Main {
 public static void main(String[] args) {
 Child1 obj1 = new Child1();
 obj1.show();
 obj1.display1();
 Child2 obj2 = new Child2();
 obj2.show();
 obj2.display2();
 }
}
