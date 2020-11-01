import java.util.Scanner;
public class number
{
	public int value;
	Scanner sc = new Scanner(System.in);
	
	public void getdetails()
	{
		System.out.println("Enter the value:-");
		value=sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("entered value is:"+value);
	}
	
	public static void main(String[] arg)
	{
		number[] number = new number[3];
		
		for(int i=0;i<3;i++)
		{
			number[i] = new number();
		}
		for(int i=0;i<3;i++)
		{
			number[i].getdetails();
		}
		for(int i=0;i<3;i++)
		{
			number[i].display();
		}
	}
}
