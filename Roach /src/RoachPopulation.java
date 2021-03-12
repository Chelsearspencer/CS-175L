import javax.swing.JOptionPane;

public class RoachPopulation {	 
	  
	  private double roachPop;
	    
	  public RoachPopulation(double StartPop) {
		 roachPop = StartPop;
		  
	  }
		
		public void breed() {
			roachPop = roachPop * 2;
		}
			
		public void spray(double sprayPct){
			roachPop = roachPop-(roachPop*sprayPct);
		}
		
		public double getRoaches() {
			return roachPop;
		}
		      
				   }
				

			
