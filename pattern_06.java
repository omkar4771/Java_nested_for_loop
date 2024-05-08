package nested_for_loop;

import java.util.Scanner;

public class pattern_06 {

	public static void main(String[] args) 
	{

		int i,j,n,k=1;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+k++);
			}
			System.out.println("");
		}

	}

}
