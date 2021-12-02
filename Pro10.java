//Write a Java Program to find the Transpose of a given Matrix.
package mainpackage;
import java.util.*;

public class Pro10 
{

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		int r,c;
		int i,j;
		System.out.println("Enter the no rows and column of matrix : ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		
		int arr[][]= new int[r][c];
		System.out.println("Enter the matrix : ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original matrix : ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose matrix:");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}