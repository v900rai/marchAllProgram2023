package ArraysProgram;
import java.util.Scanner;
public class Reversenumbeinjavaprogram 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to reverse");
		int number=sc.nextInt();
		int reverse=0;
		while(number!=0)
		{
			reverse=reverse*10;
			reverse=reverse%10;
			number=number/10;
		}
		System.out.println("Reverse of entered number is "+reverse);
	}

}
