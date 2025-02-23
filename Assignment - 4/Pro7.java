//7. Implement - this keyword can be used to return current class instance.

class ThisReturnInstance {
 ThisReturnInstance getObject() {
 return this;
 }
 void display() {
 System.out.println("This keyword returned the current class
instance!");
 }
 public static void main(String[] args) {
 ThisReturnInstance obj = new
ThisReturnInstance().getObject();
 obj.display();
 }
}