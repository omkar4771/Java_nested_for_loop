package nested_for_loop;
import java.util.*;
public class pattern_14
{

	public static void main(String[] args) 
	{
		int i,j,n;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
	}

}
