
package demo5;
import java.util.InputMismatchException;


public class Demo5 {

    public static void main(String[] args) {
       
         try{
              String s=null;  
               System.out.println(s.length()); 
        }
        catch(ArithmeticException e){
            System.out.println("THE EXCEPTION IS: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("THE EXCEPTION IS: "+e);
        }
        catch(InputMismatchException e){
            System.out.println("THE EXCEPTION IS: "+e);
        }
        catch(Exception e){
            System.out.println("THE COMMON EXCEPTION IS: "+e);
        }
        
        
   System.out.println("************THE FINAL LINE OF THIS CODE*******************");
        
    }
    
}
