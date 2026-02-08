import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String getDateDuJour() {
        LocalDate aujourdhui = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return aujourdhui.format(formatter);
    }
    
    public static void afficherDate() {
        System.out.println("Date du jour : " + getDateDuJour());
    }
}