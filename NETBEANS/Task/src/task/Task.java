package task;

import java.io.*;
import java.util.*;


 abstract class Exam {
    protected double quizMark,attandanceMark,performanceMark,termExam,midContribute,finalContribute;//encapsulation
  static double marks;
  private String name,id;
  
 
	 private final String depertme="CSE";//encapsulation
         
	  Exam(double quizMark,double attandanceMark,double performanceMark,double termExam){
		 this.quizMark=quizMark;
		 this.attandanceMark=attandanceMark;
		 this.performanceMark=performanceMark;
		 this.termExam=termExam;
                 //constructor
		 }
          void student(String name,String id){
          this.name=name;
          this.id=id;
       
          }
          
           abstract void result();
          abstract void calculate();//method overriding
           double calculate(double midContribute,double finalContribute){//Method Over Loading
              this.midContribute=midContribute;
              this. finalContribute= finalContribute;
              return marks=(midContribute + finalContribute);
          }
}

 class MidTerm extends Exam {
      public MidTerm(double quizMark,double attandanceMark,double performanceMark,double termExam) {
        super(quizMark, attandanceMark, performanceMark, termExam);
    }

    
    @Override
    void result(){
        marks=quizMark+attandanceMark+performanceMark+termExam;
        
    }
    @Override
    void calculate(){
        midContribute= marks*0.4;
        System.out.println("Contributable marks is: "+midContribute);
    }
    

}



 class FinalTerm extends MidTerm {
     public FinalTerm(double quizMark,double attandanceMark,double performanceMark,double termExam){
        super(quizMark, attandanceMark, performanceMark, termExam);
    }
     @Override
    void result(){
        marks=quizMark+attandanceMark+performanceMark+termExam;
     
    }
    @Override
    void calculate(){
        finalContribute= marks*0.6;
        System.out.println("Contributable marks is: "+finalContribute);
    }
}




public class Task {
   
    
    public static void main(String []args){ 
    Scanner input=new Scanner(System.in);
    File FILE=new File("SMS.txt");
  try{ 
      
    FileWriter writer;
    String NewLine=System.getProperty("line.separator");
    while(true)
    {   
    System.out.println("**Weclome To Student Result Management System** ");
       
    System.out.println("To continue press 1 && To exit press anything");
    int a=input.nextInt();
        
    if(a==1){
     
    System.out.println("Enter 1 to add Student Infotmation");
    System.out.println("Enter 2 to display Student Infotmation");
    int c=input.nextInt();
    if(c==1){
        System.out.println("HOW MANT STUDENT");
      int n=input.nextInt();
     for(int i=1;i<=n;i++)
     {
    writer=new FileWriter(FILE,true);
    input.nextLine();
    System.out.println("Enter Students Name: ");
    String NAME;
    NAME=input.nextLine();
    System.out.println("Enter Students ID: ");
    String id=input.nextLine();
	System.out.println("Enter Students COURSE: ");
    String C=input.nextLine();
    
            
    System.out.println("Mid Term Quiz Marks: ");
    double quizMark=input.nextDouble();
    System.out.println("Mid Term AttandanceMarks: ");
    double attandanceMark=input.nextDouble();
    System.out.println("Mid Term PerformanceMarks: ");
    double performanceMark=input.nextDouble();   
    System.out.println("Mid Term Exam Marks: ");
    double termExam=input.nextDouble(); 
    Exam ob = new MidTerm(quizMark,attandanceMark,performanceMark,termExam);
    ob.result();
    //ob.grade();
    ob.calculate();
    
    
    System.out.println("Final Term Quiz Marks: ");
    double quizMark1=input.nextDouble();
    System.out.println("Final Term AttandanceMarks: ");
    double attandanceMark1=input.nextDouble();
    System.out.println("Final Term PerformanceMarks: ");
    double performanceMark1=input.nextDouble();   
    System.out.println("Final Term Exam Marks: ");
    double termExam1=input.nextDouble(); 
    Exam ob1 = new FinalTerm(quizMark1,attandanceMark1,performanceMark1,termExam1);
     
    ob1.result();
    ob1.calculate();
    
    //ob1.grade();
    System.out.println("Mid Contributable mark: ");
    double midContribute=input.nextDouble();
    System.out.println("Final Contributable mark: ");
    double finalContribute=input.nextDouble();
    double f=ob1.calculate(midContribute, finalContribute);
    String S=String.valueOf(f);
    //ob1.student(name,id);
    
    //ob1.grade();
    
     if(f>=90&&f<=100)
        {
          writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+"   GRADE:A+"+NewLine);
        }
        else if(f>=85&&f<90)
        {
         writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+"   Grade is: A"+NewLine);
        } 
        else if(f>=80&&f<85)
        {
           writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+"  Grade is: B+"+NewLine);
        }
        else if(f>=75&&f<80)
        {
            writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+" Grade is: B"+NewLine);
        }
        else if(f>=70&&f<75)
        {
            writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+" Grade is: C+"+NewLine);
        }
        else if(f>=65&&f<70)
        {
           writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+" Grade is: C"+NewLine);
        }
        else if(f>=60 &&f<65)
        {
           writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+" Grade is: D+"+NewLine);
        }
        else if(f>=50&&f<60)
        {
            writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+" Grade is: D"+NewLine);
        }
        else
        {
            writer.write("NAME: "+NAME+" ID: "+id+" COURSE: "+C+" TOTAL MARK:"+S+" You are Fail"+NewLine);
        }
      
    writer.close();
     }
            }
        else if(c==2) {
        
           Scanner read;
                  read=new Scanner(FILE);
                  while(read.hasNext())
                  {
                   String text=read.nextLine();
                   System.out.println(text);
                  }
                  read.close();  
            
            
            
             
                           }   
    
        }
        else{
            
   System.out.println("Thank You");
   
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
    
}
    }
