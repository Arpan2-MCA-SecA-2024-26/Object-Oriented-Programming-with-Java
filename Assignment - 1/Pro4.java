//4. Write a Java Program to calculate factorial value of a declared variable by creating separate method for factorial segment.

public class Pro4
{
	public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorialResult = factorial(number);
            System.out.println("The factorial of " + number + " is: " + factorialResult);
        }
        scanner.close();
    }
}