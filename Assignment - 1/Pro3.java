//3. Write a Java Program to calculate factorial value of a declared variable.

public class Pro3
{
	public static void main(String[] args) {
	    int fact=1, n=5;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
		System.out.println("Factorial of "+n+" is "+fact);
	}
}