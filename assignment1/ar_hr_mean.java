import java.util.Scanner;

public class ar_hr_mean{

    public static void main(String[] args){

        int n1,n2;
	float am,hm;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

	am=(n1+n2)/2;

        System.out.println("Arithmetic mean:"+am);


	hm=(n1*n2)/(n1+n2);

        System.out.println("Harmonic mean:"+hm);


    }
}