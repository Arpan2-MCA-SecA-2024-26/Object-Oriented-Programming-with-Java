//6. Implementation of this keyword to pass as argument in the constructor call.

class B {
 B(ThisAsConstructor obj) {
 System.out.println("Constructor called using 'this' as
argument!");
 }
}
class ThisAsConstructor {
 void display() {
 new B(this);
 }
}
public class Main {
 public static void main(String[] args) {
 ThisAsConstructor obj = new ThisAsConstructor();
 obj.display();
 }
}