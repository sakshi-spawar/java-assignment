import java.util.Scanner;

public class areaOfCircle{

    public static void main(String[] args){

        double radius,area,height,volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of cylinder:");
        radius = sc.nextDouble();

	System.out.println("Enter height of cylinder:");
        height = sc.nextDouble();

        area=(2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
        System.out.println("area of cylinder:"+area);

        volume=Math.PI*radius*radius*height;
        System.out.println("volume of cylinder:"+volume);





    }
}