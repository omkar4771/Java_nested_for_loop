package nested_for_loop;

import java.util.Scanner;

public class pattern_16 
{

	public static void main(String[] args)
	{
		int i,j,n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j%2==1)
				{
					if(i%2==1)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print(" # ");
					}
				}
				else
				{
					if(i%2==1)
					{
						System.out.print(" # ");
					}
					else
					{
						System.out.print(" * ");
					}
				}
			}
			System.out.println(" ");
		}
	}

}
