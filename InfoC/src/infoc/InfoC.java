
package infoc;
class A{
     String name;
    int id=0;
    String  address;
}


public class InfoC {


    public static void main(String[] args) {
 A ob1=new A();
    A ob2=new A();
      ob1.name="SAM";
      ob1.id=1950;

      ob1.address="BASUNDHARA";
       ob2.name="JOHN";
      ob2.id=1950;
    
      ob2.address="KURATOLI";
      System.out.println("THE NAME/JOING YEAR/ADDRESS:");
       System.out.println(ob1.name+" "+ob1.id+" "+ob1.address);

       System.out.println(ob2.name+" "+ob2.id+" "+ob2.address);
       System.out.println();
    }
    
}
