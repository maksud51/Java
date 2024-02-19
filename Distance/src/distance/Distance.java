
package distance;
class AddDistance{
    void cal(int a,int b){
        System.out.println("DISTACE: "+(a-b)+"inch");
    }
}

public class Distance {

    public static void main(String[] args) {
       AddDistance ob1=new AddDistance();
       ob1.cal(8, 5);
    }
    
}
