// 1/2

import java.util.Scanner;

public class 2 {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);

         System.err.print("Entrez une chaine de caractères (6 char minimum)");
         String xd = sc.nextLine();
         if(xd.length() > 6){
            for(int i = 0; i < xd.length(); i++) {
               if(i%2 != 0) {
                  System.out.print("");
               } else {
                  System.out.print(xd.charAt(i));
               }

            }
         } else {
            System.err.print("Trop peu de characètres (6 min)");
         }
         sc.close();
      }
      catch (Exception e) {
         main(args);
      }
   }
}