//10. Write java codes to implement the followings – Methods of Stringbuffer class: append(), capacity(), charAt(), delete(), deleteCharAt().; ensureCapacity(), getChars(), indexOf(), insert(), length(), setCharAt(), setLength(), substring(), toString().

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = sc.nextLine();
 // Creating StringBuffer object
 StringBuffer sb = new StringBuffer(input);
 // append() - Appends a string
 sb.append(" World");
 System.out.println("After append: " + sb);
 // capacity() - Returns the current capacity
 System.out.println("Capacity: " + sb.capacity());
 // charAt(index) - Returns character at a specific index
 System.out.println("Character at index 2: " + sb.charAt(2));
 // delete(start, end) - Deletes characters from start index to
end index
 sb.delete(2, 4);
 System.out.println("After delete(2,4): " + sb);
 // deleteCharAt(index) - Deletes character at a specific index
 sb.deleteCharAt(5);
 System.out.println("After deleteCharAt(5): " + sb);
 // ensureCapacity(minCapacity) - Ensures the buffer has
minimum capacity
 sb.ensureCapacity(50);
 System.out.println("Ensured capacity: " + sb.capacity());
 // getChars(start, end, charArray, destIndex) - Copies
characters into a character array
 char[] charArray = new char[5];
 sb.getChars(0, 5, charArray, 0);
 System.out.print("Characters copied to array: ");
 for (char ch : charArray) {
 System.out.print(ch + " ");
 }
 System.out.println();
 // indexOf(substring) - Returns index of substring
 System.out.println("Index of 'o': " + sb.indexOf("o"));
 // insert(index, string) - Inserts a string at the specified index
 sb.insert(2, "Java");
 System.out.println("After insert(2, 'Java'): " + sb);
 // length() - Returns length of StringBuffer
 System.out.println("Length of StringBuffer: " + sb.length());
 // setCharAt(index, char) - Sets character at specific index
 sb.setCharAt(1, 'X');
 System.out.println("After setCharAt(1, 'X'): " + sb);
 // setLength(newLength) - Changes length of the string
 sb.setLength(10);
 System.out.println("After setLength(10): " + sb);
 // substring(start, end) - Extracts a part of the string
 System.out.println("Substring (1, 4): " + sb.substring(1, 4));
 // toString() - Converts StringBuffer to String
 String convertedString = sb.toString();
 System.out.println("Converted to String: " + convertedString);
 }
}