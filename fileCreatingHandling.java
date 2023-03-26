package filehandling;

import java.io.*;


public class fileCreatingHandling
{
	public static void main(String []args) throws IOException
	{
		File f1=new File("C:\\Users\\user\\Desktop\\Vishalrai.text");
		if(f1.createNewFile())
		{
			System.out.println("File Succesfully created....!");
		}
		else
		{
			System.out.println("File Allready Exist...!");
		}
	}

}
