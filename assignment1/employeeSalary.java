import java.util.Scanner;

public class employeeSalary{

	public static void main(String[] args){
	
	float da,hra,tax,ts,bs;
	int id;
	String name;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter employee details:");
	System.out.println("ID : ");
	id=sc.nextInt();
	System.out.println("Name : ");
	name=sc.next();
	System.out.println("Basic salary : ");
	bs=sc.nextFloat();
	System.out.println("DA (%) : ");
	da=sc.nextFloat();
	System.out.println("HRA (%) : ");
	hra=sc.nextFloat();
	System.out.println("TAX (%) : ");
	tax=sc.nextFloat();

	ts=bs+((bs*(da+hra-tax))/100);

	System.out.println("Total Salary: "+ts);
	
}

}