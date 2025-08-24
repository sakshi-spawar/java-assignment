import java.util.Scanner;

public class evenOdd{

	public static void main(String[] args){

	int n;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number : ");
	n=sc.nextInt();

	if(n%2==0)
	System.out.println("Number is even number.");
	else
	System.out.println("Number is odd number.");

	
}


}