package student_management_system;

class FinalExam extends MidExam{ 
    private   double FinalTerm;
    protected double FinalTotal;
    public    double Result;
   
   Double FinalCalculation(double FinalTerm)//The Calculation of 60% of Final
   {
       this.FinalTerm=FinalTerm;
       double cal;
       cal=Quiz1+Quiz2+Attendence+Performance+FinalTerm;
       FinalTotal=0.6*cal;
       return FinalTotal;
   }
     
    @Override
    public void ShowInfo()
    {
        super.ShowInfo();
        System.out.println("FINAL-EXAM MARK IS: "+FinalTerm);
        System.out.println("60% OF FINAL-EXAM MARK IS: "+FinalTotal);
    }
    
    
    Double GrandTotal()//The sum of 60% of final & 40% of Midterm
    {
        Result=MidTotal+FinalTotal;
        return Result;   
    }
}

