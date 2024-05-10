package nested_for_loop;

import java.util.Scanner;

public class pattern_17_a 
{

	public static void main(String[] args) 
	{
		int i,j,n,ch=96;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) //row
		{
			for(j=1;j<=i;j++)//coloum
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println(" ");

		}
		for(i=n-1;i>=1;i--)//column
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println(" ");
		}

	}

}
