package nested_for_loop;
import java.util.*;
public class pattern_05 
{
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
				System.out.print(" "+k);
				k=k+2;
			}
			System.out.println("");
		}
	}

}
