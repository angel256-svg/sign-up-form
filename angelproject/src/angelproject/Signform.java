package angelproject;
import java.util.Scanner;
public class Signform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correctpincode="2012";
		String correctphonenumber="0762144698";
		Scanner input=new Scanner(System.in);
		for(int attempts=1; attempts<=2; attempts++) {
			System.out.println("attempt "+ attempts + " enter credentials again");
			String pincode=input.nextLine();
			String phonenumber=input.nextLine();
			
		
		
		if(pincode.equals(correctpincode)&&phonenumber.equals(correctphonenumber)) {
			System.out.println("Login successfully");
			break;
			
			
		}else {
			System.out.println("Login failed");
			
		}

			
			
			
			
			
			
			
			
		}	
			
	}

}
