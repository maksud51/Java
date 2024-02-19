
package average;
class AverageCal{
    int total;
    void calculate(int a,int b,int c)
    {
        total=(a+b+c)/3;
        System.out.println("THE AVERAGE IS: "+total);
    }
    
}

public class Average {

    public static void main(String[] args) {
        AverageCal ob1=new AverageCal();
        ob1.calculate(3, 4, 5);

   
    }
    
}
