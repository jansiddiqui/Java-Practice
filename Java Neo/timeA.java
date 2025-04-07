import java.time.*;
public class timeA {
    public static void main(String[] args) {
        LocalDate Today = LocalDate.now();
        System.out.println(Today);

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        LocalDate pluseDate = Today.plusDays(15);
        System.out.println(pluseDate);

        LocalDate pluseMonth = Today.plusMonths(2);
        System.out.println(pluseMonth);

        LocalDate pluseDayMonth =Today.plus(Period.of(2, 4, 3));
        System.out.println(pluseDayMonth);

        LocalDate minuseDayMonth =Today.minus(Period.of(2, 4, 3));
        System.out.println(minuseDayMonth);

        LocalDate aaa = Today.plusYears(2);
        aaa = aaa.plusMonths(4);
        aaa = aaa.plusDays(3);
        System.out.println(aaa);

        int monthss = aaa.getMonthValue();
        int yesrss = aaa.getYear();
        int dayss = aaa.getDayOfMonth();
        
        System.out.println(yesrss);
        System.out.println(monthss);
        System.out.println(dayss);
    }
}
