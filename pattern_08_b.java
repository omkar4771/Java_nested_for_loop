package nested_for_loop;

import java.util.Scanner;

public class pattern_08_b 
{

	public static void main(String[] args) 
	{
		int i,j,n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
		for(i=1;i<=n;i--) //row
		{
			for(j=1;j<=i;j--)//coloum
			{
				System.out.print(" "+i);
			}
				System.out.println("");
		}
	}
}
