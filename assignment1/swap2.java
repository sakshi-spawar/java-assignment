import java.util.Scanner;

public class swap2{

	public static void main(String[] args){
	
	int n1,n2,temp;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 2 numbers:");
	n1=sc.nextInt();
	n2=sc.nextInt();

	temp=n1;
	n1=n2;
	n2=temp;

	System.out.println("After swapping numbers:"+n1+"\n"+n2);	
		
	}
}