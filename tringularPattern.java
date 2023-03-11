import java.util.Scanner;
public class tringularPattern 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int r=sc.nextInt();
		for(int i=1; i<=r; i++)
		{
			for(int j=1; i<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	
		
	}

}
