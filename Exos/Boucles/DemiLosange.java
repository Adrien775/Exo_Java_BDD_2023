//Demi-Losange


import java.util.Scanner;

public class DemiLosange {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();

         for(int i = x; i > 0; i--){
            for(int j = 1; j < i; j++){
               System.err.print(" ");
            }
            for (int k = i; k<=x; k++){
               System.err.print("*");
            }
            System.err.println(""); 
         }

         System.err.println(""); 


         for(int a = 0; a < x; a++){
            for (int z = 1; z < a + 1; z++){
               System.err.print(" ");
            }
            for(int b = x; b > a; b--){
               System.err.print("*");
            }
            System.err.println(""); 
         }

         sc.close();

      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}
