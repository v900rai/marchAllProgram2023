
public class isPrimeNumber 
{
	public static boolean isPrime(int n)
	{
		boolean isPrime=true;
		for(int i=2; i<=n-1; i++)
		{
			if(n%i==0)
			{
				isPrime=false;	
			}
		}
		return isPrime;
	}
	public static void isPrimeRange(int n)
	{
		for(int i=2; i<=n; i++)
		{
			if(isPrime(i)) {
				System.out.print(i+" , ");
			}
		}
		System.out.println();
	}
	public static void main(String []vishal)
	{
		isPrimeRange(20);
	}

}
