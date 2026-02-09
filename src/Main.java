import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        
        do {
            afficherMenu();
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            
            switch (choix) {
                case 1:
                    // Appeler module Ajouter opérateur (Équipe B)
                    break;
                case 2:
                    // Appeler module Enregistrement production (Équipe C)
                    break;
                case 3:
                    // Appeler module Affichage production du jour (Équipe D)
                    break;
                case 4:
                    // Appeler module Génération rapport (Équipe E)
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide.");
            }
        } while (choix != 5);
        
        scanner.close();
    }
    
    public static void afficherMenu() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Ajouter un opérateur");
        System.out.println("2. Enregistrer une production");
        System.out.println("3. Afficher la production du jour");
        System.out.println("4. Générer un rapport du jour");
        System.out.println("5. Quitter");
    }
}