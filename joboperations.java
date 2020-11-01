 
 class jobs
 {
	 public void operation()
	 {
		 System.out.println("Operations: \n");
	 }
	 
 }
 
 class doctor extends jobs
 {
	public void operation_doctor()
	{
		System.out.println("Doctor: To maintains or restores human health \n");
	}
	
 }
 
 class engineer extends jobs
 {
	public void operation_engineer()
	{
		System.out.println("Engineer: To analyze , develop and evaluate large-scale, complex systems\n ");
	}
	
 }
 
 class pilot extends jobs
 {
	public void operation_pilot()
	{
		System.out.println("Pilot: Controls the flight of an aircraft by operating its directional flight controls \n ");
	}
	
 }
 
 class joboperations
 {
	 public static void main(String arg[])
	 {
		 jobs a=new jobs();
		 doctor a1=new doctor();
		 engineer a2=new engineer();
		 pilot a3= new pilot();
		 a.operation();
		 a1.operation_doctor();
		 a2.operation_engineer();
		 a3.operation_pilot();
	 }
 }