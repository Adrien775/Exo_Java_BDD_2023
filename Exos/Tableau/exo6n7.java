import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exo6n7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Saisir au minimum 3 chiffres à la suite, exemple : (6 78 15)");

            int res = sc.nextInt();
            for (int i = 0; i < 2; i++) {
                int nombre = sc.nextInt();
                if (Math.abs(nombre) < Math.abs(res) ||
                    (Math.abs(nombre) == Math.abs(res) && nombre > res)) {
                    res = nombre;
                }
            }

            System.out.println(res);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

