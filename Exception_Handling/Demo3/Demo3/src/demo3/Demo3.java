
package demo3;

public class Demo3 {


    public static void main(String[] args) {
        
        try{
            int[] a=new int[10];
            a[20]=25;
        }
        catch(ArithmeticException e){
            System.out.println("THE EXCEPTION IS: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("THE EXCEPTION IS: "+e);
        }
        catch(Exception e){
            System.out.println("THE Common EXCEPTION: "+e);
        }
        
        
   System.out.println("******************THE FINAL LINE OF THIS CODE**********************");
        
    }
    
}
