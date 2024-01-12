//Nombre de E

import java.util.Scanner;

public class E {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);

         System.err.print("Entrez une chaine de caractères (6 char minimum)");
         String xd = sc.nextLine();
         if(xd.length() > 6){
            int compteur = 0;

            for(int i = 0; i < xd.length(); i++) {
                if(xd.charAt(i) == 'e') {
                    compteur++;
                }
            }
    
            System.out.println("Le nombre de 'e' dans la chaine est: " + compteur);

         } else {
            System.err.print("Trop peu de characètres (6 min)");
         }
         sc.close();
      }
      catch (Exception e) {
         System.err.println("Veuillez entrer un nombre entier");
         main(args);
      }
   }
}
