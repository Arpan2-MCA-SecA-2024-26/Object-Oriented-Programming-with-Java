//10. Create a “circle” class & a “point” class. The coordinates of the circle are given and used within the “circle” class as object of the “point” class. Display the area of circle.

class Point {
 double x, y;
 Point(double x, double y) {
 this.x = x;
 this.y = y;
 }
}
class Circle {
 double radius;
 Point center;
 Circle(double radius, double x, double y) {
 this.radius = radius;
 this.center = new Point(x, y);
 }
 double area() {
 return Math.PI * radius * radius;
 }
 void display() {
 System.out.println("Circle Center: (" + center.x + ", " +
center.y + ")");
 System.out.println("Circle Area: " + area());
 }
}
public class Main {
 public static void main(String[] args) {
 Circle c = new Circle(5, 3, 4);
 c.display();
 }
}