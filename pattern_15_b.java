package nested_for_loop;

import java.util.Scanner;

public class pattern_15_b 
{

	public static void main(String[] args) 
	{
		int i,j,n;
		System.out.println("Enter the nunber");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==1)
				{
					System.out.print(" 1 ");
				}
				else
				{
					System.out.print(" 0 ");
				}
			}
			System.out.println(" ");
		}

	}

}
