package nested_for_loop;

import java.util.Scanner;

public class pattern_12 
{

	public static void main(String[] args) 
	{
		int i,j,n,ch=96,k=64;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(k+j)+(char)(ch+j));
				//System.out.print(""+(char)(ch+j));
			}
			System.out.println(" ");
		}

	}

}
