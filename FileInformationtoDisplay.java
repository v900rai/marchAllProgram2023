package filehandling;
import java.io.*;
public class FileInformationtoDisplay
{
	public static void main(String []args)
	{
		File f1 =new File ("C:\\Users\\user\\Desktop\\Vishalrai.text");
		if(f1.exists())
		{
			System.out.println("File Name: "+f1.getName());
			System.out.println("File Location Area :"+f1.getAbsolutePath());
			System.out.println(" File writable :"+f1.canWrite()); 
			System.out.println("File Readable :"+f1.canRead());
			System.out.println("File Size :"+ f1.length());
		}
		else
		{
			System.out.println("File doe't Exist"); 
		}
	}

}
