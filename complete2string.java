package stringAllPeogram;
import java.util.*;
public class complete2string 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number s1");
		String s1=sc.nextLine();
		System.out.println("Enter the second string s2");
		String s2=sc.nextLine();
		if ( s1.compareTo(s2) > 0 )
			 System.out.println("First string is greater than second.");
			 else if ( s1.compareTo(s2) < 0 )
			 System.out.println("First string is smaller than second.");
			 else
			 System.out.println("Both strings are equal.");
	}

}
