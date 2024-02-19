
package file;

import java.io.FileOutputStream;  
public class File {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}


























import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // create a file object for the current location
    File file = new File("19-40645-1.txt");
 Scanner in = new Scanner(System.in);
         String s = in. nextLine();
		 String t = in. nextLine();
		 String q = in. nextLine();
         String data = (""+s);
		 System.out.println("");
		 String data1 = (""+t);
		 System.out.println("");
		 String data2 = (""+q);
		 char[] array = new char[100];
    try{
      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
	  // Creates a Writer using FileWriter
       FileWriter output = new FileWriter("19-40645-1.txt");
       // Writes string to the file
	   output.write(data);
	   System.out.println("");
	   output.write(data1);
	   System.out.println("");
	   output.write(data2);
       System.out.println("Data is written to the file.");
       // Closes the writer
       output.close();
	    FileReader input = new FileReader("19-40645-1.txt");
      // Reads characters
      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);
      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}