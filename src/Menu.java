import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class MenuLogger {
    public static void logAction(String action) {
        try (FileWriter writer = new FileWriter("data/menu_log.txt", true)) {
            writer.write(LocalDateTime.now() + " : " + action + "\n");
        } catch (IOException e) {
            System.out.println("Erreur de journalisation.");
        }
    }
}