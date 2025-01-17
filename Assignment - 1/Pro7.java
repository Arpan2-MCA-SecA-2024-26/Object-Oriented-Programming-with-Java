//7. Write a Java Program to display whether a number is odd or even.

import java.util.Scanner;
public class Pro7
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.print("Enter a number: ");
	    n=sc.nextInt();
	    if(n%2==0)
	        System.out.println("Even number");
	    else
	        System.out.println("Odd number");
	}
}