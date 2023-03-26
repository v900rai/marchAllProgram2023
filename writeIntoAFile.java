package filehandling;

import java.io.*;

public class writeIntoAFile 
{
	public static void main(String [] vishalrai)
	{
		try
		{
			FileWriter f1= new FileWriter("C:\\Users\\user\\Desktop\\vishalrai.text");
			
				try
				{
					f1.write("Java Programming  is the best language ...!");
				}
				finally 
				{
					f1.close();
				}
				System.out.println("Successfully Data  wrote in File ");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}
}

