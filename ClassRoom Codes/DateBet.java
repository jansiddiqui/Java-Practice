public import java.time.*;
import java.time.temporal.*;
class DateBet{
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(2024, 4, 1);
        LocalDate date2 = LocalDate.of(2025, 4, 1);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between: " + daysBetween);
    }
}