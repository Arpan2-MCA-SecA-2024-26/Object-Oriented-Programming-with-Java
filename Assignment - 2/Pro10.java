//10. Implementation of call by value and call by reference.

class CallByValueReference {
 public void callByValue(int x) {
 x = x * 2;
 System.out.println("Inside method (Call by Value): " + x);
 }
 public void callByReference(int[] arr) {
 arr[0] = arr[0] * 2;
 System.out.println("Inside method (Call by Reference): " +
arr[0]);
 }
 public static void main(String[] args) {
 CallByValueReference obj = new CallByValueReference();
 int a = 10;
 System.out.println("Before method call (Call by Value): " + a);
 obj.callByValue(a);
 System.out.println("After method call (Call by Value): " + a);
 int[] arr = {10};
 System.out.println("\nBefore method call (Call by Reference):
" + arr[0]);
 obj.callByReference(arr);
 System.out.println("After method call (Call by Reference): " +
arr[0]);
 }
}
