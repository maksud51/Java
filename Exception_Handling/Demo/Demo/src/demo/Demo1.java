
package demo;
import java.util.Scanner;
public class Demo1 {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     try{
         System.out.println("PLEASE FIRST NUMBER: ");
         int x=in.nextInt();
         System.out.println("PLEASE SECOND NUMBER: ");
         int y=in.nextInt();
         int z=x/y;
         System.out.println("THE RESULT OF (X/Y) IS"+z);
     }
     catch(Exception e){
         System.out.println("THE EXCEPTION IS: "+e);
     }
     System.out.println("PLEASE TRY AGAIN");
    }
}
