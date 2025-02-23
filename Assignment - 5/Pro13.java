//13. Write a program to define a class Item containing code and price. Accept this data for five objects using array of objects. Display code, price in tabular form and also, display total price of all items.

import java.util.Scanner;
class Item {
 int code;
 double price;
 Item(int code, double price) {
 this.code = code;
 this.price = price;
 }
 void display() {
 System.out.println(code + "\t" + price);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Item[] items = new Item[5];
 double total = 0;
 for (int i = 0; i < 5; i++) {
 System.out.print("Enter item code and price: ");
 int code = sc.nextInt();
 double price = sc.nextDouble();
 items[i] = new Item(code, price);
 total += price;
 }
 System.out.println("Code\tPrice");
 for (Item item : items) item.display();
 System.out.println("Total Price: " + total);
 }
}