package nested_for_loop;
import java.util.*;
public class pattern_18 
{

	public static void main(String[] args) 
	{
		int i,j,k,n;
		System.out.println("Enter the number = ");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
