
package triangle;

class A{
    int a1,a2,a3,s,total;
    A(int x,int y,int z)
    {
        a1=x;
        a2=y;
        a3=z;
        s=(a1+a2+a3)/2;
        total =(s*(s-a1)*(s-a2)*(s-a3));
  System.out.println("THE AREA IS:"+total);

}}
    
        
public class Triangle {

    public static void main(String[] args) {
        A ob1=new A(3,4,5);
        

    }
    
}
