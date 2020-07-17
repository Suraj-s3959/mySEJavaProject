import java.util.Scanner;

public class CalculateBill {

	public static void main(String[] args) {
		
		
		System.out.println("***Software Application for doctor and Patient ***");
		
		Scanner obj1 = new Scanner(System.in);     
		// Asking the type of the service the Patients wants
		System.out.println("Enter(Press 1 or 2) the Service You want  // Or Press Q for quitting the Application ");
		
		System.out.println("1. Appointment with doctor");
		
		System.out.println("2 . Consultation from doctor");
		
		String ser = obj1.next();
		// Asking the name of the Patient
		
		System.out.println("Enter Your name");
		
		String pn = obj1.next();
		
		// Asking the Problem of the Patient
		System.out.println("Enter Your Problem");
		String pr= obj1.next();
		
		
		
		// if the user will press Q he/she can quit the software Application otherwise user can continue using the application
		while(!ser.equals("Q"))
		{
			
		
		if(ser.equals("1"))
		{
			Appointment obj2 = new Appointment(ser,pn,pr);
			
			obj2.display();
		}
		else if(ser.equals("2"))
		{
			Consultation obj3 = new Consultation(ser,pn,pr);
			
			obj3.display();
			
		}
		System.out.println("Enter(Press 1 or 2) the Service You want  // Or Press Q for quitting the Application ");
		
		 ser = obj1.next();
		}
		
		
		
		
		
		

	}

}
