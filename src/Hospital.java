
public class Hospital 
{
	
	protected String service;
	protected String Patientname;
	protected String Problem;
	protected double fee;
	
	
	public Hospital(String ser , String Pname , String Prob )
	{
		service = ser;
		Patientname = Pname;
		Problem = Prob;
		
	}
	
	public void display()
	{
		System.out.println("Doctor spelization is in " + service);
		System.out.println("Patient name is "+ Patientname);
		System.out.println("Fee is"+ fee);
		
	}
	
	
	
	
	
	
	
	
	
	

}
