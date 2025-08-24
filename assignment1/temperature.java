import java.util.Scanner;

public class temperature{

    public static void main(String[] args){

        float f,cel;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in fahrenheit:");
        f = sc.nextFloat();

	cel = (f-32)*5/9;

        System.out.println("Temperature in Celsius:"+cel);





    }
}