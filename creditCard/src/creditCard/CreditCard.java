package creditCard;
import java.util.Scanner;
public class CreditCard { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

System.out.println("Enter credit card number, or enter -99 to stop: ");
String cardNum = " ";
		
		while (in.hasNextLine()) {
			cardNum=in.nextLine();
			if (cardNum.equals("-99")){
				System.out.println("All done, bye");
				break;
			}
		int i = 0;
		while (i < cardNum.length()) {
			char ch = cardNum.charAt(i);
		if (ch == ' '|| ch =='-') {
			String before = cardNum.substring(0,i);
			String after = cardNum.substring(i+1);
			cardNum = before + after ;
		}
		else {
			i++;
		}
		}
		System.out.println(cardNum);
		System.out.println("Enter credit card , or enter -99 to stop: ");	
	}
		}
	}
		
		
