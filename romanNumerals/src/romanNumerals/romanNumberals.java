package romanNumerals;
import javax.swing.JOptionPane;
public class romanNumberals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String num = JOptionPane.showInputDialog("Input number 1-3999 (please use 0 as placeholders, 0000 format)");
int number = Integer.parseInt(num);

String thousand1 = num.substring(0,1);
String hundred1 = num.substring(1,2);
String tens1 = num.substring(2,3);
String ones1 = num.substring(3,4);

int thousand = Integer.parseInt(thousand1);
int hundred = Integer.parseInt(hundred1);
int tens = Integer.parseInt(tens1);
int ones = Integer.parseInt(ones1);

if (thousand <= 1) {
	thousand1 = "M";
}
else if (thousand <= 2) {
	thousand1 = "MM";
}
else if (thousand <= 3) {
	thousand1 = "MMM";
}
if (hundred <= 1) {
	hundred1 = "C";
}
else if(hundred <= 2) {
	hundred1 = "CC";
}
else if(hundred <= 3) {
	hundred1 = "CCC";
}	
else if(hundred <= 4) {
	hundred1 = "CD";
}
else if(hundred <= 5) {
	hundred1 = "D";
}
else if(hundred <= 6) {
	hundred1 = "DC";
}
else if(hundred <= 7) {
	hundred1 = "DCC";
}
else if(hundred <= 8) {
	hundred1 = "DCC";
}
else if(hundred <= 9) {
	hundred1 = "CM";
}

if (tens <= 1) {
	tens1 = "X";
}
else if(tens <= 2) {
	tens1 = "XX";
}
else if(tens <= 3) {
	tens1 = "XXX";
}	
else if(tens <= 4) {
	tens1 = "XL";
}
else if(tens <= 5) {
	tens1 = "L";
}
else if(tens <= 6) {
	tens1 = "LX";
}
else if(tens <=7) {
	tens1 = "LXX";
}
else if(tens <= 8) {
	tens1 = "LXXX";
}
else if(tens <= 9) {
	tens1 = "XC";
}

if (ones <= 1) {
	ones1 = "I";
}
else if(ones <= 2) {
	ones1 = "II";
}
else if(ones <= 3) {
	ones1 = "III";
}
else if(ones <= 4) {
	ones1 = "IV";
}
else if(ones <= 5) {
	ones1 = "V";
}
else if(ones <= 6) {
	ones1 = "VI";
}
else if(ones <= 7) {
	ones1 = "VII";
}
else if(ones <= 8) {
	ones1 = "VIII";
}
else if(ones <= 9) {
	ones1 = "IX";
}



JOptionPane.showMessageDialog(null,"Your number is" + thousand1 + hundred1 + tens1 + ones1);
		
		
		
		
		
		
	}

}
