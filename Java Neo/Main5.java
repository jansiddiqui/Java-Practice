import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main5 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, 1, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(date.format(formatter));
    }
}