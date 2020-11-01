import java.util.*;

class arrayemployees
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

	public static void main(String arg[])
	{
		arrayemployees[] oj=new arrayemployees[3];
		
		for(int i=0;i<3;i++)
		{
			oj[i]=new arrayemployees();
		}
		
		for(int i=0;i<3;i++)
		{
			oj[i].getdetails();
		}
		
		for(int i=0;i<3;i++)
		{
			oj[i].displaydetails();
		}
		
		
	}
}