//Retour a la ligne


import java.util.Scanner;

public class Rligne {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);

         System.err.print("Entrez une chaine de caractères (6 char minimum)");
         String xd = sc.nextLine();
         if(xd.length() > 6){
            for(int i = 0; i < xd.length(); i++) {
               if(xd.charAt(i) == ' ') {
                  System.out.println();
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
