//Tables Multiplication


import java.util.Scanner;

public class Tables {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();

         for(int i = 1; i <= x; i++){
            System.err.print(x + "*" + i + " =" ); 
            System.err.print(x*i); 

            System.err.println(""); 
         }
         sc.close();

      } }
}