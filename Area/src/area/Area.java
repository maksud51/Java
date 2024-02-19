
package area;
import java.util.Scanner;
class A{
    int length=0;
    int width=0;
    int area=0;
    void setDim(int a,int b){
        length=a;
        width=b;
    }
    int getArea(){
        area=length*width;
        return area;
    }
    
}

public class Area {

    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          int x,y;
          System.out.print("PLEASE ENTER THE VALUE OF LENGTH AND WIDTH: ");
          x=input.nextInt();
          y=input.nextInt();
          
           A ob1=new A();
           ob1.setDim(x,y);
       System.out.println("The AREA IS: "+ob1.getArea());
        System.out.print("PLEASE ENTER THE VALUE OF LENGTH AND WIDTH: ");
          x=input.nextInt();
          y=input.nextInt();
              A ob2=new A();
               ob2.setDim(x,y);
       System.out.println("The AREA IS: "+ob2.getArea());
 
    }
    
}
