//1. Write a java program to implement the static keyword in java.

class StaticExample {
 static int count = 0;
 StaticExample() {
 count++;
 }
 void display() {
 System.out.println("Object Count: " + count);
 }
 public static void main(String[] args) {
 StaticExample obj1 = new StaticExample();
 StaticExample obj2 = new StaticExample();
 obj1.display();
 }
}