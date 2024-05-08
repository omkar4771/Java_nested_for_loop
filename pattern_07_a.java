package nested_for_loop;
import java.util.Scanner;
public class pattern_07_a
{

	public static void main(String[] args) 
	{

		int ch=64;
		int k=1,i,j,n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)//row
		{
		for(j=1;j<=i ; j++ )//column
		{
		System.out.print(" "+(char)(ch+j));
		}
		System.out.println();
		}

	}

}
