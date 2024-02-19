package student_management_system;
import java.util.*;
import java.io.*;
public class StudentManagementSystem {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      FinalExam ob[]=new FinalExam[20];
      int j = 0;
      File FILE=new File("19-41168-2.txt");
      try{
      String NewLine=System.getProperty("line.separator");
      while(true){
      FileWriter writer;
      String Id="19-41168-2";
      String Password="12345";
      System.out.println("");
      System.out.println("          **************WELCOME TO STUDENT MANAGEMENT SYSTEM**************         ");
      System.out.println("");
      System.out.print("Please Enter Your ID---->");
      String I=input.next();
      System.out.print("Please Enter Your Password---->");
      String P=input.next();
      if(I.equals(Id)&&P.equals(Password))
      {
        boolean Con=true;
      System.out.println("");
      System.out.println("           **********WELCOME TO STUDENT MANAGEMENT SYSTEM****************    ");
      System.out.println("");
      while(Con){
          Con=true;
          int i=0; 
          System.out.println("0.EXIT");
          System.out.println("1.ADD STUDENT INFORMATION");
          System.out.println("2.SHOW STUDENT INFORMATION ");
          System.out.print("ENTER YOUR OPTION: ");
          i=input.nextInt();
          System.out.println();
      switch(i){
            case 0:
                  System.out.println();
                  Con=false;
                  break;
            case 1:  
        String name,id,sec,ay,course,Grand;
        double q1,q2,att,per,mid,f,grand;
        ++j;
        ob[j]=new FinalExam();
        writer = new FileWriter(FILE,true);
        System.out.print("PLEASE ENTER STUDENT NAME: ");
        input.nextLine();
        name=input.nextLine();
        writer.write("NAME: "+name);
        writer.write("    "+NewLine);
        System.out.print("PLEASE ENTER STUDENT ID: ");
        id=input.nextLine();
        writer.write("ID: "+id);
        writer.write("    "+NewLine);
        System.out.print("PLEASE ENTER STUDENT SECTION: ");
        sec=input.nextLine();
        writer.write("SECTION: "+sec);
        writer.write("    "+NewLine);
        System.out.print("PLEASE ENTER STUDENT ACADEMIC YEAR: ");
        ay=input.nextLine();
        writer.write("ACDEMIC YEAR: "+ay);
        writer.write("    "+NewLine);
        System.out.print("PLEASE ENTER STUDENT COURSE: ");
        course=input.nextLine();
        writer.write("COURSE: "+course);
        writer.write("    "+NewLine);
        ob[j].SetInfo(name,id,sec,ay,course);
        System.out.print("PLEASE ENTER STUDENT MIDTERM'S QUIZ 1 MARK OUT OF 20: ");
        q1=input.nextDouble();
        if(0>q1||q1>20)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO EQUAL OR LESS THAN 20");}
        System.out.print("PLEASE ENTER STUDENT MIDTERM'S QUIZ 2 MARK OUT OF 20: ");
        q2=input.nextDouble();
        if(0>q2||q2>20)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  EQUAL OR LESS THAN 20");}
        System.out.print("PLEASE ENTER STUDENT MIDTERM'S ATTENDENCE MARK OUT OF 10: ");
        att=input.nextDouble();
        if(0>att||att>10)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 10");}
        System.out.print("PLEASE ENTER STUDENT MIDTERM'S PERFORMANCE MARK OUT OF 10: ");
        per=input.nextDouble();
        if(0>per||per>10)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 10");}
        ob[j].SetInfo(q1,q2,att,per);
        System.out.print("PLEASE ENTER STUDENT  MIDTERM MARK OUT OF 40: ");
        mid=input.nextDouble();
        if(0>mid||mid>40)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 40");}
        ob[j].MidCalculation(mid);
        double MT=ob[j].MidCalculation(mid);
        String M=String.valueOf(MT);
        writer.write("40% OF MID-TERM: "+M);
        writer.write("    "+NewLine);
        System.out.print("PLEASE ENTER STUDENT FINALTERM'S QUIZ 1 MARK OUT OF 20: ");
        q1=input.nextDouble();
         if(0>q1||q1>20)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 20");}
        System.out.print("PLEASE ENTER STUDENT FINALTERM'S QUIZ 2 MARK OUT OF 20: ");
        q2=input.nextDouble();
        if(0>q2||q2>20)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 20");}
        System.out.print("PLEASE ENTER STUDENT FINALTERM'S ATTENDENCE MARK OUT OF 10: ");
        att=input.nextDouble();
        if(0>att||att>10)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 10");}
        System.out.print("PLEASE ENTER STUDENT MIDTERM'S PERFORMANCE MARK OUT OF 10: ");
        per=input.nextDouble();
         if(0>per||per>10)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 10");}
        ob[j].SetInfo(q1,q2,att,per);
        System.out.print("PLEASE ENTER STUDENT  FINALTERM MARK OUT OF 40: ");
        f=input.nextDouble();
         if(0>f||f>60)
        {throw new ArithmeticException("PLEASE ENETR MARK 0 TO  OR LESS THAN 60");}
        ob[j].FinalCalculation(f);
        double FT=ob[j].FinalCalculation(f);
        String F=String.valueOf(FT);
        writer.write("60% OF FINAL-TERM: "+F);
        writer.write("    "+NewLine);
        grand=ob[j].GrandTotal();
        Grand=String.valueOf(grand);
        writer.write("AFTER TAKING 60% FROM FINAL AND 40% FROM MIDTERM"+NewLine);
        //THIS IS THE CALCULATION OF GRADE 
        if(grand>=0&&grand<50){
         writer.write("TOTAL MARK IS:"+Grand+NewLine+"THE GRADE IS F");
         writer.write("    "+NewLine);
        }
        else if(grand>=50&&grand<55){
         writer.write("TOTAL MARK IS :"+Grand+NewLine+"THE GRADE IS E");
         writer.write("    "+NewLine);
        }
        else if(grand>=55&&grand<60){
         writer.write("TOTAL MARK IS :"+Grand+NewLine+"THE GRADE IS D");
         writer.write("    "+NewLine);
        }
        else if(grand>=60&&grand<65){
         writer.write("TOTAL MARK IS: "+Grand+NewLine+"THE GRADE IS D+");
         writer.write("    "+NewLine);
        }
        else if(grand>=65&&grand<70){
         writer.write("TOTAL MARK IS: "+Grand+NewLine+"THE GRADE IS C");
         writer.write("    "+NewLine);
        }
        else if(grand>=70&&grand<75){
         writer.write("TOTAL MARK IS: "+Grand+NewLine+"THE GRADE IS C+");
         writer.write("    "+NewLine);
        }
        else if(grand>=75&&grand<80){
         writer.write("TOTAL MARK IS: "+Grand+NewLine+"THE GRADE IS B");
         writer.write("    "+NewLine);
        }
        else if(grand>=80&&grand<85){
         writer.write("TOTAL MARK IS: "+Grand+NewLine+"THE GRADE IS B+");
         writer.write("    "+NewLine);
        }
        else if(grand>=85&&grand<90){
         writer.write("TOTAL MARK IS: "+Grand+NewLine+"THE GRADE IS A");
         writer.write("    "+NewLine);
        }
        else if(grand>=90&&grand<=100){
         writer.write("TOTAL MARK IS: "+Grand+NewLine+"THE GRADE IS A+");
         writer.write("    "+NewLine);
        }
        else {
             System.out.println("SOMETHING IS WRONG");
        }
         writer.write("   **********************"+"STUDENT INFORMATION"+"***********************  "+NewLine);
         writer.write("    "+NewLine);
         writer.close();
        System.out.println("***********************************************");
        System.out.println();
                  break;
            case 2:
                  Scanner read;
                  read=new Scanner(FILE);
                  while(read.hasNext())
                  {
                   String text=read.nextLine();
                   System.out.println(text);
                  }
                  read.close();
                  break;
	    default:
                  System.out.println("PLEASE CHOOSE 0 OR 1 OR 2"); 
              
        }
       
      } 
            
      }
      else
      {
        System.out.println(" ID OR PASSWORD MAY WRONG!");
        System.out.println("Please Try Again");
      }
      }
        
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
        finally
        {
        System.out.println("");
        System.out.println("**************************************************");			
        System.out.println("PLEASE RESTART THE PROGRAMME");
        System.out.println("**************************************************");
       System.out.println("");
	}       
    }
     
}
