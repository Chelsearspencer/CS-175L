import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	
	String firstName = ("firstName") ;
	String lastName = ("lastName");
	String houseNumber = ("1234");
	String streetName = ("street Name");
	String yesOrNo = ("yesOrNo");
	
	System.out.println("Please enter your first name: ");
	firstName = in.next();
	firstName = firstName.replace(firstName,firstName);
	
	System.out.println("Please enter your last name: ");
	lastName = in.next();
	lastName = lastName.replace(lastName,lastName);
	
	System.out.println("Please enter your house number: ");
	houseNumber = in.next();
	houseNumber = houseNumber.replace(houseNumber,houseNumber);

	System.out.println("Please enter your street name: ");
	streetName = in.next();
	streetName = streetName.replace(streetName, streetName);
	
	
	
	System.out.println("Dear, " + firstName+ " " + lastName );
	
	System.out.println( "Please confrim that your address is " + houseNumber+ " " + streetName + " Lane") ;
	
	System.out.println("is this address correct? :" );
	yesOrNo = in.next();
	yesOrNo = yesOrNo.replace(yesOrNo,yesOrNo);
	
	System.out.println("Your answer is: " + yesOrNo + " Goodbye!");
	
	in.close();
	
	}

}
