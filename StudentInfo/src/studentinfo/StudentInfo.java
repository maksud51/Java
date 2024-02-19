
package studentinfo;

public class StudentInfo {

    String name;
    int id=0;
    double phone_number=0;
    String  address;

    public static void main(String[] args) {
      StudentInfo ob1=new StudentInfo();
      StudentInfo ob2=new StudentInfo();
      ob1.name="SAM";
      ob1.id=1950;
      ob1.phone_number=0155412351;
      ob1.address="BASUNDHARA";
       ob1.name="JOHN";
      ob1.id=4450;
      ob1.phone_number=0166465351;
      ob1.address="KURATOLI";
      System.out.println("THE NAME/ID/MOBILE NUMBER/ADDRESS:");
       System.out.println(ob1.name+" "+ob1.id+" "+ob1.phone_number+" "+ob1.address);
       System.out.println();
         System.out.println("THE NAME/ID/MOBILE NUMBER/ADDRESS:");
       System.out.println(ob2.name+" "+ob2.id+" "+ob2.phone_number+" "+ob2.address);
       System.out.println();
       
       
      
      
    }
    
}
