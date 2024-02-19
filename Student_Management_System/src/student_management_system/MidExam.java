package student_management_system;
import java.util.*;

 class MidExam implements Exam {
    Scanner input=new Scanner(System.in);
    //ENCAPSULATION
    private String Name;
    private String Id;
    private String Section;
    private String AcademicYear;
    private String CourseName;
    public  double Attendence;
    public  double Performance;
    public  double Quiz1;
    public  double Quiz2;
    private double MidTerm;
    protected double MidTotal;
    
     @Override
    public void SetInfo(String Name,String Id,String Section,String AcademicYear,String CourseName)//OVERRIDDING ALSO OVERLOADING
    {
       
        this.Name=Name;
        this.Id=Id;
        this.Section=Section;
        this.AcademicYear=AcademicYear;
        this.CourseName=CourseName;
    }
   
     @Override
    public void SetInfo(double Attendence,double Performance,double Quiz1,double Quiz2)//OVERRIDDING ALSO OVERLOADING
    {
        this.Attendence=Attendence;
        this.Performance=Performance;
        this.Quiz1=Quiz1;
        this.Quiz2=Quiz2;
      
    }
   Double MidCalculation(double MidTerm)//The Calculation of 40% of Midterm
   {
       this.MidTerm=MidTerm;
       double cal;
       cal=Quiz1+Quiz2+Attendence+Performance+MidTerm;
       MidTotal=0.4*cal;
       return MidTotal;
   }
    
     @Override
    public void ShowInfo()//OVERRRIDNG
    {
        System.out.println("NAME IS: "+Name);
        System.out.println("ID IS: "+Id);
        System.out.println("SECTION IS: "+Section);
        System.out.println("ACADEMIC-YEAR IS: "+AcademicYear);
        System.out.println("COURSE-NAME IS: "+CourseName); 
        System.out.println("MID-EXAM MARK IS: "+MidTerm);
        System.out.println("40% OF MID-EXAM MARK IS: "+MidTotal);
    }
          
}
