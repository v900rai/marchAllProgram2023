package ArraysProgram;

public class countOcuurinance 
{
	public static void main(String []args)
	{
		char ch='v';
		int count=0;
		String name="vvvishalraiv";
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)==ch)
			{
				count++;
				
			}
			
		}
		System.out.println
        ("The character '" + ch + "' found " + count + " times in a string '" + name + "'.");
		
	}

}
