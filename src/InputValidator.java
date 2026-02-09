import java.util.Scanner;

public class InputValidator {
    public static int validerChoixMenu(Scanner scanner) {
        int choix = -1;
        try {
            choix = scanner.nextInt();
            if (choix < 1 || choix > 5) {
                System.out.println("Erreur : choisissez entre 1 et 5.");
                choix = -1;
            }
        } catch (Exception e) {
            System.out.println("Erreur : entrez un nombre valide.");
            scanner.nextLine(); // Vider le buffer
        }
        return choix;
    }
}