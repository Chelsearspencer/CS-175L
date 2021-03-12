import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Scanner;
public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String roach = JOptionPane.showInputDialog("Enter initial roach population:");
	     double startPop = Double.parseDouble(roach);
	     DecimalFormat decFormat = new DecimalFormat("0");
	     
	     RoachPopulation Roaches = new RoachPopulation(startPop);
	     
	    //initial pop
	     JOptionPane.showMessageDialog(null,"The initial roach population is: "+ Roaches.getRoaches());
	    
	     //cycle 1 breeding
	     Roaches.breed();
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 1 breeding is: "+ Roaches.getRoaches());
		 
	     //cycle 1 50% spray
	     String input = JOptionPane.showInputDialog("Enter spray percentage:");
	     double spraypct = Double.parseDouble(input);
	     Roaches.spray(spraypct);
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 1 50% spray is: "+ Roaches.getRoaches());
	    
	     //cycle 2 breeding
	     Roaches.breed();
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 2 breeding is: "+ Roaches.getRoaches());
		 
	     //cycle 2 60% spray
	     String input1 = JOptionPane.showInputDialog("Enter spray percentage:");
	     double spraypct1 = Double.parseDouble(input1);
	     Roaches.spray(spraypct1);
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 2 60% spray is: "+ Roaches.getRoaches());
	    
	     //cycle 3 breeding 
	     Roaches.breed();
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 3 breeding is: "+ Roaches.getRoaches());
		 
	     //cycle 3 70% spray
	     String input2 = JOptionPane.showInputDialog("Enter spray percentage:");
	     double spraypct2 = Double.parseDouble(input2);
	     Roaches.spray(spraypct2);
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 3 70% spray is: " + decFormat.format(Roaches.getRoaches()));
	    
	     //cycle 4 breeding
	     Roaches.breed();
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 4 breeding is: "+ decFormat.format(Roaches.getRoaches()));
		 
	     //cycle 4 80% spray
	     String input3 = JOptionPane.showInputDialog("Enter spray percentage:");
	     double spraypct3 = Double.parseDouble(input3);
	     Roaches.spray(spraypct3);
	     JOptionPane.showMessageDialog(null,"Roach population after cycle 4 80% spray is: "+ decFormat.format(Roaches.getRoaches()));
	    
	      
	      
		
	}

}
