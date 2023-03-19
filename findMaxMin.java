package ArraysProgram;

public class findMaxMin 
{
	public static void main(String [] args)
	{
		int[] number= new int[]{10, 12, 15,18,11,44};
		int maxNumber=number[0];
		int minNumber=number[0];
		for(int i=0; i<number.length; i++)
		{
			if(minNumber<number[i])
			{
				maxNumber=number[i];
		}
			
		else if(minNumber>number[i]) {
				minNumber=number[i];
		}	
		}
		System.out.println("maxnumber"+maxNumber+"minnumber"+minNumber);
	}

}
