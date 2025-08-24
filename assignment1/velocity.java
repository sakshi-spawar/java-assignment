import java.util.Scanner;

public class velocity{

    public static void main(String[] args){

        int u,a,t,v,s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial velocity:");
        u = sc.nextInt();

        System.out.println("Enter acceleration:");
        a = sc.nextInt();

        System.out.println("Enter time:");
        t = sc.nextInt();

	v=u+a*t;

        System.out.println("final velocity:"+v);


	s=u+((a*t)*(a*t));
	System.out.println("Distance travelled:"+s);


    }
}