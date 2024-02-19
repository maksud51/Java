
package complex;

class A
{
   
    void makeComplex(int x,int y)
    {
        System.out.println("THE COMPLEX EQUATION IS: "+x+"+i"+y);
    }
}
public class Complex {

    
    public static void main(String[] args) {
            
       A ob1=new A();
       A ob2=new A();
       ob1.makeComplex(3,4);
       ob2.makeComplex(5,8);

       

    }
    
}
