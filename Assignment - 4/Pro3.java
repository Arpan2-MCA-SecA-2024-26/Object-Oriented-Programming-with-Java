//3. Implementation of this keyword to invoke current class method.

class Main {
 void display() {
 System.out.println("Hello from display method!");
 }
 void show() {
 this.display();
 }
 public static void main(String[] args) {
 Main obj = new Main();
 obj.show();
 }
}