//Write a Java program to calculate Fibonacci Series up to n numbers.

package mainpackage;

import java.util.Scanner;

public class Pro2 
{

	public static void main(String[] args) 
	{
		
		int n;
		System.out.println("Enter number of elements you want to print :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		fibonacci(n1,n2,n-2);
		
	}
	public static void fibonacci(int n1,int n2,int n)
	{
		if(n>0)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacci(n1,n2,n-1);
		}
		
	}
}