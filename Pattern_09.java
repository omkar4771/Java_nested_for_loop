package nested_for_loop;
import java.util.*;
public class Pattern_09 
{

	public static void main(String[] args) 
	{
		int n,i,j,ch=96;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println("");
		}
	}

}
