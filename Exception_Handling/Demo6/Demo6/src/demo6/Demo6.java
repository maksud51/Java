
package demo6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo6 {

  
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
         try{
              System.out.print("PLEASE FIRST NUMBER: ");
         int x=in.nextInt();
         System.out.print("PLEASE SECOND NUMBER: ");
         int y=in.nextInt();//IF WE WILL INPUT A STRING INSTEAD OF INTEGER
         int z=x/y;
         System.out.println("THE RESULT OF (X/Y) IS "+z);
            
        
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
