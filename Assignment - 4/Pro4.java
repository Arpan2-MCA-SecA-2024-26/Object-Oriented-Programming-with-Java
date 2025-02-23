//4. Implementation of this keyword to invoke current class constructor.

class Main {
 Main() {
 this(100);
 System.out.println("Default Constructor");
 }
 Main(int x) {
 System.out.println("Parameterized Constructor: " + x);
 }
 public static void main(String[] args) {
 new Main();
 }
}