
package TriangleP ;

class A{
    int a1,a2,a3,s,total;
    A()
    {
        a1=3;
        a2=4;
        a3=5;
        s=(a1+a2+a3)/2;
        total =(s*(s-a1)*(s-a2)*(s-a3));
  System.out.println("THE AREA IS:"+total);

}}
    
        
public class TriangleP{

    public static void main(String[] args) {
        A ob1=new A();
        

    }
    
}
