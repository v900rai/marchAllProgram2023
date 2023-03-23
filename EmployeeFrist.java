package Employee;

import java.security.KeyStore.ProtectionParameter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeFrist 
{
	
		Scanner s=new Scanner(System.in);
		public void insertEmp() throws Exception
		{
			System.out.println("Enter the employee Id,name & Salary");
			int id =s.nextInt();
			String name =s.next();
			int sal =s.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root");
			PreparedStatement ps= c.prepareStatement("insert into employeee values(?,?,?)");
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setInt(3, sal);
			ps.execute();
			c.close();
			System.out.println("task done");
			
		}
		public void updateEmp() throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root");
			PreparedStatement ps= c.prepareStatement("update employeee set name ='vishal rai' where id=1");
			ps.executeUpdate();
			c.close();
			System.out.println("task complete");	
		}
		public void getEmp() throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root");
			PreparedStatement ps= c.prepareStatement("select*from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
			}
			c.close();
			System.out.println();
		}
		
}
 
				
	
				
		
	


