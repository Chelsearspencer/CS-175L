import javax.swing.JOptionPane;

public class AgeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String birthday = JOptionPane.showInputDialog("Enter your birthday MM/DD/YYYY:");
	     
	    String today = JOptionPane.showInputDialog("Enter todays date MM/DD/YYYY:");
	    
	    String bmonth = birthday.substring(0,2);
	    String bday = birthday.substring(3,5);
	    String byear = birthday.substring(6,10);
	    
	    String tmonth = today.substring(0,2);
	    String tday = today.substring(3,5);
	    String tyear = today.substring(6,10);
	    
	    int birthMonth = Integer.parseInt(bmonth);
	    int birthDay = Integer.parseInt(bday);
	    int birthYear = Integer.parseInt(byear);
	    
	    int todayMonth = Integer.parseInt(tmonth);
	    int todayDay = Integer.parseInt(tday);
	    int todayYear = Integer.parseInt(tyear);
	    
	    int years = todayYear - birthYear;
	    int month = 0;
	    
	    if (todayMonth < birthMonth) {
	    	years = years - 1;
	    	month = birthMonth - todayMonth;
	    JOptionPane.showMessageDialog(null,"You are "+years+ " years and "+month+ " month(s) old");
	    }
	    else if (todayMonth > birthMonth) {
	    	month = todayMonth - birthMonth;
	    JOptionPane.showMessageDialog(null,"You are "+years+ " years and "+month+ " month(s) old");	
	    }
	    else {
	    JOptionPane.showMessageDialog(null,"Invalid Age");
	    }
	    	
	 
	}

}
