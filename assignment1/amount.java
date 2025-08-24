import java.util.Scanner;

public class amount{

	public static void main(String[] args){

	int amt;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter amount : ");
	amt=sc.nextInt();

	System.out.println("10 * "+amt/10+" = "+10*(amt/10));
	amt=amt%10;

	System.out.println("5 * "+amt/5+" = "+5*(amt/5));
	amt=amt%5;

	System.out.println("1 * "+amt/1+" = "+1*(amt/1));
	
}


}
