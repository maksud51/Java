
package task2;


import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        File f=new File("19-20009-2.txt");
        String name,department,id;
        char[] array = new char[100];
         try{
            try (FileWriter output = new FileWriter("19-20009-2.txt")) {
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
                output.write(a);
                System.out.println();
                output.write(b);
                System.out.println();
                output.write(c);
                FileReader input = new FileReader("19-40645-1.txt");
                // Reads characters
                input.read(array);
                System.out.println("Data in the file:");
                System.out.println(array);
            }
      }
          catch(IOException e) {
      e.getStackTrace();
    }
   
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
class Main {
  public static void main(String[] args) {
        File file = new File("19-41212-2.txt");
 Scanner input = new Scanner(System.in);
 System.out.print("Enter Your Name: ");
         String a = input. nextLine();
		 System.out.print("Enter Your ID: ");
		 String b = input. nextLine();
		 System.out.print("Enter Your Department : ");
		 String c = input. nextLine();
         String d = (" "+a);
		 System.out.println(" ");
		 String e = (" "+b);
		 System.out.println(" ");
		 String f = (" "+c);
    try{
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("File is created");
      }
      else {
        System.out.println("File already exists");
      }
       FileWriter obj = new FileWriter("19-41212-2.txt");
	   obj.write(d);
	   System.out.println("");
	   obj.write(e);
	   System.out.println("");
	   obj.write(f);
       System.out.println("written data to the file ");
       obj.close();
	    FileReader put = new FileReader("19-41212-2.txt");
        System.out.println("Name: "+a);
		System.out.println("Id: "+b);
		System.out.println("Department: "+c);
      input.close();
    }
    catch(Exception x) {
      x.getStackTrace();
	  //MD. AHSAN NAYEM
	  //19-41212-2
	  //SEC:O
    }
  }
}
    }
   
