
public class Appointment extends Hospital{

	public Appointment(String ser, String Pname ,String prob) {
		super(ser, Pname , prob);
		
		fee = fee + 80;
	
	}
	
	@Override
	public void display()
	{
	System.out.println("***Appointment from patient***");
	System.out.println("service by the Patient is :" +"Appointment");	
	System.out.println("Patient name is :"+ Patientname);
	System.out.println("Problem of patient is :" + Problem);
	System.out.println("Fee is :"+ fee + "$");
	}
	
	
	
	
	
	
	
	

}
