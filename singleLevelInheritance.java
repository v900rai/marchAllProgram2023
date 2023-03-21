package ArraysProgram;
public class singleLevelInheritance 
{
	
	
		int x=10;
		public void m1()
		{
			System.out.println("hello vishal rai");
				
		}
}
	
	class rai extends singleLevelInheritance 
	{
		
			int y=20;
			public void  m2()
			{
				System.out.println("what are u doing vishal rai");
			}
			
		
	
	public  static void main(String [] args)
	{
		rai r=new rai();

	    r.m1();
		r.m2();
		System.out.println(r.x);
		System.out.println(r.y);
		
	}	
	}


	

