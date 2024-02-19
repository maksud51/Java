package student_management_system;
//A INTERFACE CLASS
 interface Exam {
     //THIS SET IS USING FOR SET IDENTITY INFORMATION
      public void SetInfo(String Name,String Id,String Section,String AcademicYear,String CourseName);//OVERLOADING
      //THIS SET IS USING FOR SET MARK INFORMATION
      public void SetInfo(double Attendence,double Performance,double Quiz1,double Quiz2);//OVERLOADING
      public void ShowInfo();   
}
