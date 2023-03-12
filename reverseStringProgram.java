package ArraysProgram;

public class reverseStringProgram 
{
	public static void main(String []args)
	{
		String reversstring="";
		String name="vishalrai";
		for (int i = name.length() - 1; i >= 0; i--)
		{
			reversstring=reversstring+name.charAt(i);
		}

        System.out.print("The reversed string of the '" + name + "' is: ");
		System.out.println(reversstring);
	}


}
