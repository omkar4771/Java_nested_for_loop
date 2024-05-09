package nested_for_loop;
import java.util.Scanner; 
public class pattern_13 
{

	public static void main(String[] args) 
	{
		int n,i,j;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=n;i>=1;i--)//column
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
	}

}
