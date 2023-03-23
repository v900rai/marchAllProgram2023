package ArraysProgram;
import java.util.Scanner;
public class towDarrysSearchTheElements 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int colm=sc.nextInt();
		int [][] number=new int[row][colm];
		/// input
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<colm; j++)
			{
				number[i][j]=sc.nextInt();
			}
		}
		
		/// input x found
		int x=sc.nextInt();
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<colm; j++)
			{
				/// compare the number index
				if(number[i][j]==x)
				{
					System.out.println("x found the location  "+i+" ,"+j+" ");
				}
			}
		}
		
	}

}
