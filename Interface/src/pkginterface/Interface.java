
package pkginterface;

interface Bank{
    void show();
    int x=10;
    
}    
 class Customer implements Bank{
 
  int Customer(){
      return (x+5);
      }
   public void show(){
      System.out.println("YOUR AMOUNT IS ZERO"+x);
  }
  
}

 class Employee implements Bank{
  public void show(){
      System.out.println("YOU ARE SUSPEENDED");
  }
}


public class Interface {

    public static void main(String[] args) {
    
        Bank ob;
        ob=new Customer();
        ob.show();
        ob=new Employee();
        ob.show();
        
    }
    
}
