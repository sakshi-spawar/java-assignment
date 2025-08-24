import java.util.Scanner;

public class profitLoss{

	public static void main(String[] args){

	int sp,cp,p,l;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter selling price : ");
	sp=sc.nextInt();

	System.out.println("Enter cost price : ");
	cp=sc.nextInt();

	if(sp>cp)
	{
		p=sp-cp;
		System.out.println("Seller had made profit of "+p+" rupees.");

	}
	else
	{
		l=cp-sp;
		System.out.println("Seller had loss of "+l+" rupees.");

	}

	
}


}