
package bank;

import java.util.Scanner;
class Addamount
{
	int amount=50;
        int total=0;
	Addamount()
	{
	System.out.println("NO MONEY ADDED");
	}
	Addamount(int a)
	{
	amount=amount+a;
        total=amount;
        System.out.println("Total Money is "+total);
        
	}
	
}
class Bank{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
         Addamount ob1=new Addamount();
         System.out.println("Please Enter The Amount ");
         int x=input.nextInt();
         Addamount ob2=new Addamount(x);
         

        
	}
}        
