import java.util.Random;
import java.util.Scanner;
public class arrayAndsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Random r = new Random();
        int[] value = new int[50];
        for(int i = 1; i < value.length; i++) {
            value[i] = r.nextInt(25)+1;
            System.out.printf(value[i] + "  ");
        }
        int min = 25;
        int max = 1;
        for (int i = 1; i < value.length; i++)
        {
            if (value[i] < min)
            {
                min = value[i];
            }
            if (value[i] > max)
            {
                max = value[i];
            }
        }
        System.out.println(" ");
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        int product = min*max;
        System.out.println("Product:"+ product);
        
       
	}

}
