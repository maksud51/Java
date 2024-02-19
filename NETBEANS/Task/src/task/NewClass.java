package task;//PACKAGE OF THIS CLASS
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        File f=new File("19-20009-2.txt");
        String name,department,id;
        BufferedReader br = null;
         try{
             FileWriter output=new FileWriter("19-20009-2.txt");
             Scanner in=new Scanner(System.in);
             System.out.print("ENTER THE NAME:");
             name=in.nextLine();
             String a=(""+name);
             System.out.print("ENTER THE Department:");
             department=in.nextLine();
             String b=(""+department);
             System.out.print("ENTER THE ID:");
             id=in.nextLine();
             String c=(""+id);
             //NOW WRITE IN THE FILE FROM CONSOLE'S INPUT
             output.write(a);
             System.out.println();
             output.write(b);
             System.out.println();
             output.write(c);
             //NOW Read FROM THE FILE TO CONSOLE 
             br = new BufferedReader( new FileReader("19-20009-2.txt"));
             a=br.readLine();
             System.out.println("NAME IS: "+a);
             b=br.readLine();
             System.out.println("DEPARTMENT IS: "+b);
             c=br.readLine();
             System.out.println("ID IS: "+c);
             output.close();
      }
          catch(Exception e) {
      e.getStackTrace();
    }
   
    }
        
    }
   
