package task1;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File f=new File("19-20009-2.txt");
        BufferedReader br = null;
         try{
             FileWriter output=new FileWriter("19-20009-2.txt");
             Scanner in=new Scanner(System.in);
             System.out.print("ENTER THE NAME:");
             String name=in.nextLine();
             System.out.print("ENTER THE Department:");
             String department=in.nextLine();
             System.out.print("ENTER THE ID:");
             String id=in.nextLine();
             output.write(name);
             System.out.println();
             output.write(department);
             System.out.println();
             output.write(id);
             br = new BufferedReader( new FileReader("19-20009-2.txt"));
             name=br.readLine();
             System.out.println("NAME IS: "+name);
             department=br.readLine();
             System.out.println("DEPARTMENT IS: "+department);
             id=br.readLine();
             System.out.println("ID IS: "+id);
             output.close();
      }
          catch(Exception e) {
      e.getStackTrace();
    }
   
    }
        
    }
   