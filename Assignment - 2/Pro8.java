//8. Implementation of parameterized constructor.

class ParameterizedConstructor {
 int a;
 String name;
 ParameterizedConstructor(int a, String name) {
 this.a = a;
 this.name = name;
 }
 public void display() {
 System.out.println("Integer: " + a + ", String: " + name);
 }
 public static void main(String[] args) {
 ParameterizedConstructor obj = new
ParameterizedConstructor(10, "Smith");
 obj.display();
 }
}