//6. Multiple inheritance does not support in java – justify.

// Java does not support multiple inheritance with classes, but it
supports interfaces
interface A {
 void methodA();
}
interface B {
 void methodB();
}
class C implements A, B {
 public void methodA() {
 System.out.println("Method A");
 }
 public void methodB() {
 System.out.println("Method B");
 }
}
public class Main {
 public static void main(String[] args) {
 C obj = new C();
 obj.methodA();
 obj.methodB();
 }
}