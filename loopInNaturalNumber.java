import java.util.Scanner;

public class loopInNaturalNumber 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		for(int i=1; i<=number; i++)
		{
			if(number%3==0) {
				continue;
			}
		System.out.println(i);
			
		}
		
	}

}
