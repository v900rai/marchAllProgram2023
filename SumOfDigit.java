
import java.util.Scanner;
public class SumOfDigit 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int vishal=sc.nextInt();
		int sum=0;
		int original=vishal;
		
		while(vishal>0)
		{
			sum=sum+vishal%10;
			vishal=vishal/10;
			
		
		}
		System.out.println("sum of didig"+original+"=  "+sum);
		
	}

}
