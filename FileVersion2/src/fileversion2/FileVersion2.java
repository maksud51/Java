package fileversion2;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class FileVersion2 {

    public static void main(String[] args) {
       File MyFile = new File("19-41168-52.txt");
       Scanner input=new Scanner(System.in);
       try{
           
           System.out.println("HOW MANY STUDENTS: ");
           int p=input.nextInt();
           FileWriter Output=new FileWriter("19-41168-52.txt");
           
           for(int i=1;i<=p;i++)
           {
               String name="Tamim";
               String id="65465465";
               String dep="cse";
               
               output.write(name);
               System.out.print(" ");
               output.write(id);
               System.out.print(" ");
               output.write(dep);
               System.out.println(" ");
               
               
              
               
               
               
           }
           
       }
       catch(Exception e){
           System.out.println("THE EXCEPTION IS"+e);
       }
    }
    
}
