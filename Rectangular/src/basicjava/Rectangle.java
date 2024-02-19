
package basicjava;
import java.util.Scanner;
class A
{
	int length,width;
	A()
	{
		length=0;
		width=0;
		System.out.println("THE NO PARAMETER'S LENGTH IS: "+length);
		System.out.println("THE NO PARAMETER'S WIDTH IS: "+width);
	}
	A(int a,int b)
	{
	 length=a;
	 width=b;
	 System.out.println("THE TWO PARAMETER'S AREA IS: "+length*width);
	}
	A(int a)
	{
	length=a;
     System.out.println("THE ONE PARAMETER'S AREA IS: "+length*length);
	}
}
class Rectangle{
	public static void main(String[] args)
	{
		int x,y,z;
		x=10;
		y=20;
		z=30;
		//Scanner input=new Scanner(System.in);
		A obj=new A();
	    //x=input.nextLine();
		A obj1=new A(x);
		A obj2=new A(x,y);
	}
}        


