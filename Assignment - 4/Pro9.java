//9. Implementation of this keyword as local variable suppressor.

class Main {
 int x = 10;
 void setValue(int x) {
 this.x = x;
 }
 void display() {
 System.out.println("Value of x: " + x);
 }
 public static void main(String[] args) {
 Main obj = new Main();
 obj.setValue(30);
 obj.display();
 }
}