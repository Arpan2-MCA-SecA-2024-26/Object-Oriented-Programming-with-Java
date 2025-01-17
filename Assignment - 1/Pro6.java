//6. Write a Java Program to calculate factorial value of a variable by taking input from command line.

public class Pro6
{
	public class Main{
    public static long calculateFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer as a command-line argument.");
            return;
        }
        try {
            int number = Integer.parseInt(args[0]);
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorialResult = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is: " + factorialResult);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please provide a valid integer.");
        }
    }
}