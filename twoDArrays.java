package ArraysProgram;

import java.util.Scanner;
public class twoDArrays 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int colume=sc.nextInt();
		int [][] number=new int[rows][colume];
		
		//inpute 
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<colume; j++)
			{
				number[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<colume; j++)
			{
				System.out.println(number[i][j]);
			}
			System.out.println();
		}	
	} 
}
