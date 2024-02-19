
package demo7;
//When EXCEPTION IS FOUND 

public class Demo7 {

    public static void main(String[] args) {
   try{  
   int data=25/0;  
   System.out.println(data);  
      }  
  catch(ArithmeticException e)
  {System.out.println(e);}  
  finally{System.out.println("THE FINALLY BLOCK IS RUNNING");}  
  System.out.println("*****************THE FINAL LINE OF THE CODE*************");  
    }
    
}
