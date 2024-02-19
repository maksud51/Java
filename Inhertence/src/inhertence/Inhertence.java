package inhertence;
import java.util.Scanner;
class Department
{
	String deptName;
	int creditFee;
	Department()
	{
		System.out.println("*************************************");
	}
	Department(String deptName,int creditFee)
	{
		this.deptName=deptName;
		this.creditFee=creditFee;
	}
	void calculateSemesterFee(int credit)
	{
		System.out.println("SEMESTER FEE: "+creditFee*credit);
	}
}

class CS extends Department
{
	
CS(String deptName,int creditFee)
{
	super(deptName,creditFee);
	
}

  void calculateSemesterFee(int credit)
	{
		System.out.println(" CS SEMESTER FEE: "+creditFee*credit);
	}	
}

class BBA extends Department
{
	
BBA(String deptName,int creditFee)
{
	super(deptName,creditFee);

}

  void calculateSemesterFee(int credit)
	{
		System.out.println(" BBA SEMESTER FEE: "+creditFee*credit);
	}	
}

class Inheritence{
	public static void main(String[] args)
	{
		String a; 
		int b;
		int c;
		Scanner input=new Scanner(System.in);
		System.out.print("PLEASE ENTER YOUR NAME: ");
		a=input.nextLine();
		System.out.println();
		System.out.print("PLEASE ENTER CREDIT FEE: ");
		c=input.nextInt();
		System.out.println();
		CS ob1=new CS(a,c);
		System.out.print("PLEASE ENTER YOUR CREDIT: ");
		b=input.nextInt();
		ob1.calculateSemesterFee(b);
		System.out.print("PLEASE ENTER YOUR NAME: ");
		a=input.nextLine();
		System.out.println();
		System.out.print("PLEASE ENTER CREDIT FEE: ");
		c=input.nextInt();
		System.out.println();
		BBA ob2=new BBA(a,c);
		System.out.print("PLEASE ENTER YOUR CREDIT: ");
		b=input.nextInt();
		ob2.calculateSemesterFee(b);
		
	}
}