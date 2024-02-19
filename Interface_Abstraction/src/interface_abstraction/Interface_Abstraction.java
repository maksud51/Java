package interface_abstraction;
abstract class User{
    abstract void show();
}
class Abul extends User{
    void show(){
        System.out.println("HI,I AM ABUL");
    }
} 
class Rahim extends User{
    void show(){
        System.out.println("HI,I AM Rahim");
    }
} 

public class Interface_Abstraction {

    public static void main(String[] args) {
       User ob1,ob2;
       Rahim e;
       Abul w;
       w=new Abul();
       e=new Rahim();
       e.show();
       w.show();
    }
    
}
