import java.util.Scanner;
public class housePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);		
int length = 0;
int width = 0;
int height = 0;
int numWindows = 0;
int lenWindow = 0;
int widWindow = 0;
int numDoors = 0;
int lenDoor = 0;
int widDoor = 0;
int windowArea = 0;
int doorArea = 0;
double houseArea = 0.00;
double area2 = 0.00;
double costPerSqFt = 0.00;
double totalArea = 0.00;
double costToPaint = 0.00;


System.out.println("Input length of house: ");
length = in.nextInt();
System.out.println("Input width of house: ");
width = in.nextInt();
System.out.println("Input height of house: ");
height = in.nextInt();
houseArea = 2 *(length*width) ;
area2 = 2 *(length * width) + 2 * (length* ((height-width)*.5)) ;

System.out.println("Input number of windows: ");
numWindows = in.nextInt();
System.out.println("Input length of windows: ");
lenWindow = in.nextInt();
System.out.println("Input width of windows: ");
widWindow = in.nextInt();
windowArea = numWindows * (lenWindow * widWindow);

System.out.println("Input number of doors: ");
numDoors = in.nextInt();
System.out.println("Input length of doors: ");
lenDoor = in.nextInt();
System.out.println("Input width of doors: ");
widDoor = in.nextInt();
doorArea = numDoors * (lenDoor * widDoor);

totalArea = houseArea + area2 - (doorArea + windowArea);

System.out.println("Input cost to paint square foot: ");
costPerSqFt = in.nextInt();
costToPaint = totalArea * costPerSqFt ;
System.out.println("Cost to paint house is:" + costToPaint  );

in.close();
	}

}
