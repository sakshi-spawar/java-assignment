import java.util.Scanner;

public class areaOfCircle{

    public static void main(String[] args){

        double radius,area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        radius = sc.nextDouble();

        area=Math.PI*radius*radius;
        System.out.println("area of circle:"+area);


    }
}