package ui;
import java.util.*;

public class UI {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in); 
      while(true){
      String Id="19-41168-2";
      String Password="12345";
      System.out.println("          **************WELCOME TO SMS**************         ");
      System.out.print("Please Enter Your ID---->");
      String I=in.next();
      System.out.print("Please Enter Your Password---->");
      String P=in.next();
      if(I.equals(Id)&&P.equals(Password))
      {
        boolean Con=true;
    
      System.out.println("           **********WELCOME TO STUDENT MANAGEMENT SYSTEM****************    ");
      while(Con){
          Con=true;
          int i=0; 
          System.out.println("0.EXIT");
          System.out.println("1.ADD STUDENT INFORMATION");
          System.out.println("2.SHOW STUDENT INFORMATION ");
          Scanner input=new Scanner(System.in);
          System.out.print("ENTER YOUR OPTION: ");
          i=input.nextInt();
          System.out.println();
          switch(i){
              case 0:
                  System.out.println();
                  Con=false;
                  break;
              case 1:
                  System.out.println("ID:19-41168-2");
                  System.out.println("NAME: MEHEDI HASAN TAMIM");
                  System.out.println();
                  break;
              case 2:
                  System.out.println("CURRENT CGPA IS 3.92");
                  System.out.println();
                  break;
              
        }
       
      } 
            
      }
      else
      {
          System.out.println(" ID OR PASSWORD IS WRONG!");
          System.out.println("Please Try Again");
      }
      }
    }
    
}
