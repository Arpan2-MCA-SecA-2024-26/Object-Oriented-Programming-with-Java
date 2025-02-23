//9.b) 

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String str = sc.nextLine();
 // charAt(index)
 System.out.println("Character at index 2: " + str.charAt(2));
 // compareTo(String)
 System.out.println("CompareTo 'hello': " +
str.compareTo("hello"));
 // equals(String)
 System.out.println("Equals 'hello': " + str.equals("hello"));
 // equalsIgnoreCase(String)
 System.out.println("EqualsIgnoreCase 'hello': " +
str.equalsIgnoreCase("hello"));
 // indexOf(character)
 System.out.println("Index of 'o': " + str.indexOf('o'));
 // length()
 System.out.println("Length of the string: " + str.length());
 // substring(start, end)
 System.out.println("Substring (1, 4): " + str.substring(1, 4));
 // toCharArray()
 char[] charArray = str.toCharArray();
 System.out.print("Characters in the string: ");
 for (char ch : charArray) {
 System.out.print(ch + " ");
 }
 System.out.println();
 // toLowerCase()
 System.out.println("Lowercase: " + str.toLowerCase());
 // toUpperCase()
 System.out.println("Uppercase: " + str.toUpperCase());
 // trim()
 System.out.println("Trimmed String: '" + str.trim() + "'");
 // valueOf()
 int num = 123;
 String numStr = String.valueOf(num);
 System.out.println("String representation of number: " +
numStr);
 }
}