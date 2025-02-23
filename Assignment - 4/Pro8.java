//8. Prove that this keyword refers to the current class instance variable.

class Main {
 int x;
 Main(int x) {
 this.x = x;
 }
 void display() {
 System.out.println("Instance variable x: " + x);
 }
 public static void main(String[] args) {
 Main obj = new Main(50);
 obj.display();
 }
}
