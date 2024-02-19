
package demo8;

//When EXCEPTION IS NOT FOUND BUT THE FINALLY WILL WORK

public class Demo8 {

    public static void main(String[] args) {
    try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(ArrayIndexOutOfBoundsException e)
  {System.out.println("THE EXCEPTION IS: "+e);}  
  finally{System.out.println("THE FINALLY BLOCK IS RUNNING");}  
  System.out.println("*****************THE FINAL LINE OF THE CODE*************");  
    }
    
}