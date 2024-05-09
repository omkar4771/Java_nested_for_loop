package nested_for_loop;
import java.util.*;
public class pattern_11 
{

	public static void main(String[] args) 
	{
		int i,j,n,ch=97;//ch=97--->for small letter & ch=65--->for capital letter
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch++));
			}
			System.out.println(" ");
		}

	}

}
