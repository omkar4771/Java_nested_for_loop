package nested_for_loop;
import java.util.*;
public class prime_number_24 
{

	public static void main(String[] args) 
	{
		int n,n1,i,j,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range.....!");
		n1=sc.nextInt();
		for(j=2;j<=n1;j++)//number
		{
		 n=j;//2 3 4 5
		 int div=0;
		   for(i=2;i<=(n/2);i++)
			{
			if(n%i==0)
			{
				div=1;
				break;
			}
			}	
			if(div==0)
			{
				System.out.print(" "+n);//2 3 5
			}
		}
	}
}
	
