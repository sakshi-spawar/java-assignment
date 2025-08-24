import java.util.Scanner;

public class distancePoint{

	public static void main(String[] args){

	double x1,y1,x2,y2,distance;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter x and y coordinates of first point:");
	x1=sc.nextDouble();
	y1=sc.nextDouble();

	System.out.println("Enter x and y coordinates of second point:");
	x2=sc.nextDouble();
	y2=sc.nextDouble();
	
	distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

	System.out.println("Distance between two points:"+distance);
	

	}

}