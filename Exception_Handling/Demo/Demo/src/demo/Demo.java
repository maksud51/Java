
package demo;

public class Demo {

    public static void main(String[] args) {
     try{
         int x=10;
         int y=0;
         int z=x/y;
         System.out.println("THE RESULT OF (X/Y) IS"+z);
     }
     catch(ArithmeticException e){
         System.out.println("THE EXCEPTION IS: "+e);
     }
     System.out.println("###################LAST LINE OF PROGRAMME#################");
    }
    
}
