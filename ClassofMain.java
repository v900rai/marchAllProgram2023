package edu.heca48.jspider.ClassAndObject2;
public class ClassofMain 
{
	public static void main(String[] args) 
	{ 
		Watch w=new Watch(10,5 ,33);
		System.out.println(w);
		Watch w1=new Watch(10,5 ,33);
		System.out.println(w);
		
		System.out.println(w.equals(w1));
		
	}

}
