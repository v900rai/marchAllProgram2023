import java.util.Scanner;
public class PatternRectangular 
{
	public static void main(String []vishal)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int r=sc.nextInt();
		int c=sc.nextInt();
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
