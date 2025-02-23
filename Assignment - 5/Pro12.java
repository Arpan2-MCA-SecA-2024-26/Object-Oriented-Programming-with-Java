//12. Write a program to define a class Fraction having data members numerator and denominator. Initialize three objects using different constructors and display its fractional value.

class Fraction {
 int numerator, denominator;
 Fraction() {
 this.numerator = 1;
 this.denominator = 1;
 }
 Fraction(int num, int den) {
 this.numerator = num;
 this.denominator = den;
 }
 void display() {
 System.out.println("Fraction: " + numerator + "/" +
denominator);
 }
 public static void main(String[] args) {
 Fraction f1 = new Fraction();
 Fraction f2 = new Fraction(3, 4);
 f1.display();
 f2.display();
 }
}