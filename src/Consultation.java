
public class Consultation extends Hospital 
{

	public Consultation(String ser, String Pname, String prob) {
		super(ser, Pname , prob );
		// TODO Auto-generated constructor stub
		fee = fee+ 30;
		
		
	}
	@Override
	public void display()
	{
	System.out.println("***Doctor's consultation is taken**");
	System.out.println("service by the Patient is " +"Consultation");	
	System.out.println("Patient name is "+ Patientname);
	System.out.println("Problem of patient is :" + Problem);
	System.out.println("Fee is :"+ fee +"$");
	}
	
	

}
