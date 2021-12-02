//Write a Java program to calculate a Factorial of a number.

package mainpackage;
import java.util.*;
public class Pro3 
{

	public static void main(String[] args) 
	{
		
		int num,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number whose factorial you want to find :");
		num=sc.nextInt();
		ans=fact(num);
		System.out.println("Factorial of given numbers : "+ans);
		
		
	}
	public static int fact(int n)
	{
		if(n>1)
		{
			n=n*fact(n-1);
			//return n;
		}
		return n;
		
		
	}

}