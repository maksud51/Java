package test;
import java.util.Scanner;
 class Test {

    public static void main(String[] args) {
   
         Scanner sc=new Scanner(System.in);
          int N = sc.nextInt();
          int res=0;

        for(int i=1;i<=10;i++)
        { 
            res=N*i;
            System.out.println(N+" X "+i+" = "+res);
        }

      

        
      
    }
    
}
