import java.util.Scanner;

public class sumofSeries 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int ans=0;
		for(int i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				ans=ans-i;
			}
			else {
				ans=ans+i;
			}
			System.out.println(ans);
		}
		
	}

}
