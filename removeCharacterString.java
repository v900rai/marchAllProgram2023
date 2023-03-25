package stringAllPeogram;

public class removeCharacterString 
{
	public static void main(String []args)
	{
		String str="this@#is@#$my!@#book^&*this~!string@#specialcharacter";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
