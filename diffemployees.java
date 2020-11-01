import java.util.*;

class employees
{
		String name,designation;
		int age;
		double salary;
		Scanner a= new Scanner(System.in);
		Scanner a1= new Scanner(System.in);	
		public void getdetails()
		{
			System.out.println("\n");
			System.out.println("Enter the name of employee");
			name=a1.nextLine();
		
			System.out.println("Enter the age of employee");
			age=a.nextInt();
		
			System.out.println("Enter the salary of employee");
			salary=a.nextInt();
		
			System.out.println("Enter the designation of employee");
			designation=a1.nextLine();
			
		}
	
		public void displaydetails()
		{
			System.out.println("\n"+"Employee name:"+name +"\n"+"Employee age: "+age+" years" +"\n"+"Employee salary: Rs."+salary +"\n"+"Employee designation: "+designation);
		}
}

class employee1 extends employees
{
	
}

class diffemployees
{
	public static void main(String arg[])
	{
		employees oj=new employees();
		int i,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of employee");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			oj.getdetails();
		}
		
		for(i=0;i<n;i++)
		{
			oj.displaydetails();
		}
		
		
	}
}