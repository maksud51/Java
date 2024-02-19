
package info;
class A{
    
    String name;
    int id=0;
 
    String  address;
}

public class Info {
static void main(String[] args) {

    A ob1=new A();
      A ob2=new A();
      ob1.name="SAM";
      ob1.id=1950;
    
      ob1.address="BASUNDHARA";
       ob1.name="JOHN";
      ob1.id=1950;
  
      ob1.address="KURATOLI";
      System.out.println("THE NAME/ YEAR OF JOINING /ADDRESS:");
       System.out.println(ob1.name+" "+ob1.id+" "+ob1.address);
       System.out.println();
         System.out.println("THE NAME/  YEAR OF JOINING   /ADDRESS:");
       System.out.println(ob2.name+" "+ob2.id+" "+ob2.address);
       System.out.println();
    }
    
}
