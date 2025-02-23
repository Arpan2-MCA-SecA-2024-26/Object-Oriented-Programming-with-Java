//5. Implementation of this keyword to pass as an argument in the method.

class Main {
 void show(Main obj) {
 System.out.println("Method called using this as argument!");
 }
 void display() {
 show(this);
 }
 public static void main(String[] args) {
 Main obj = new Main();
 obj.display();
 }
}