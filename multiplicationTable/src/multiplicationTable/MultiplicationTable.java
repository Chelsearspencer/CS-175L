package multiplicationTable;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++){
      	  for (int a=1;a<=10;a++)
      	  System.out.print(String.format("%4d",i*a));
      	  System.out.println(); 
	}

}
}