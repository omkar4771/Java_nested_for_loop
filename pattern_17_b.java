package nested_for_loop;
import java.util.Scanner;
public class pattern_17_b 
{

	public static void main(String[] args) 
	{
		int i,j,n,ch=96;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println(" ");
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println(" ");
		}
	}

}
