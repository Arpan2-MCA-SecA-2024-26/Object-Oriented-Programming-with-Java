//9.a) Write java codes to implement the followings – Basic string handling concepts- Concept of mutable and immutable string, Methods of String class-charAt(), compareTo(), equals(), equalsIgnoreCase(), indexOf(), length() , substring().; toCharArray(), toLowerCase(), toString(), toUpperCase() , trim() , valueOf() methods.

public class Main {
 public static void main(String[] args) {
 String str1 = "Hello";
 str1.concat(" World");
 System.out.println("Immutable String: " + str1);
 StringBuilder sb = new StringBuilder("Hello");
 sb.append(" World");
 System.out.println("Mutable String: " + sb);
 }
}