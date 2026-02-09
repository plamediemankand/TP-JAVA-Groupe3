import java.io.File;

public class FileChecker {
    public static boolean verifierFichiersExistants() {
        File dossierData = new File("data/");
        if (!dossierData.exists()) {
            System.out.println("Le dossier 'data/' n'existe pas. Création...");
            return dossierData.mkdir();
        }
        return true;
    }
    
    public static boolean verifierFichierOperateurs() {
        File fichier = new File("data/operators.txt");
        if (!fichier.exists()) {
            System.out.println("Attention : operators.txt n'existe pas.");
            return false;
        }
        return true;
    }
}