import java.util.Scanner;

public class areaOfCuboid{

    public static void main(String[] args){

        float l,b,h,area,volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of cuboid:");
        l = sc.nextFloat();

        System.out.println("Enter breadth of cuboid:");
        b = sc.nextFloat();

        System.out.println("Enter height of cuboid:");
        h = sc.nextFloat();

        area=((l*b)+(l*h)+(b*h));
        System.out.println("surface area of cuboid:"+area);

        volume=l*b*h;
        System.out.println("volume of cuboid:"+volume);





    }
}