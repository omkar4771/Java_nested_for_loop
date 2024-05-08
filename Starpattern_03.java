package nested_for_loop;
import java.util.*;
public class Starpattern_03 
{

	public static void main(String[] args)
	{
		int i,j,n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) //row
		{
			for(j=1;j<=i;j++)//coloum
			{
				System.out.print(" * ");
			}
			System.out.println("");
	}
}
}