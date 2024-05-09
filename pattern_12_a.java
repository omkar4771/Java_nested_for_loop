package nested_for_loop;
import java.util.*;
public class pattern_12_a 
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
				System.out.print(" "+(char)(k+i)+(char)(ch+i));
			}
			System.out.println(" ");
		}

	}

}
