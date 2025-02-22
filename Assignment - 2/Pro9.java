//9. Implementation of returning the value from the caller method.

class ReturnValue {
 public int square(int x) {
 return x * x;
 }
 public static void main(String[] args) {
 ReturnValue obj = new ReturnValue();
 int result = obj.square(5);
 System.out.println("Square of 5 is: " + result);
 }
}
