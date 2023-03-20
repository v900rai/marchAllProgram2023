package edu.hjspider.heca48.collection.Linklist;
import java.util.LinkedList;
public class linkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList l1= new LinkedList();
		l1.add(10);
		l1.add("vishal");
		l1.add(null);
		l1.add('h');
		l1.add("Raiarohi");
		l1.add(12);
		l1.add(10);
		//a
		System.out.println("display the all values");
		System.out.println("li="+l1);
		System.out.println();	
		
		System.out.println("Display the all int values");
		for(int i=0; i<l1.size(); i++)
		{
			Object O=l1.get(i);
			if(O instanceof Integer)
			{
				System.out.println(O);
			}
		}
		System.out.println("Display the String values that endwith i");
		for(int i=0; i<l1.size(); i++)
		{
			Object O=l1.get(i);
			if(O instanceof String)
			{
				System.out.println(O);
			}
		}
	}
	

}
