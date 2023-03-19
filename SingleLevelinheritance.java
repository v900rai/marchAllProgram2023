package DSA;

public class SingleLevelinheritance 
{
	int a=10;
	public void  m1() {
		System.out.println("vishal rai");
	}
	
}
class b extends SingleLevelinheritance
{
	int b=20;
	public void m2() {
		System.out.println("Kunj Rai");
	}
	

public static void main(String [] args)
{
	b b1=new b();
	System.out.println("main start ");
	System.out.println(b1.a);
	System.out.println(b1.b);
	b1.m1();
	b1.m2();
}	
}
