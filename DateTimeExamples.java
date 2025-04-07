// Java solutions for common date and time problems

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DateTimeExamples {

    // 1. Get Current Date and Time
    public static void currentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current DateTime: " + now.format(format));
    }

    // 2. Extract Components
    public static void extractComponents() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Day: " + now.getDayOfMonth());
        System.out.println("Month: " + now.getMonthValue());
        System.out.println("Year: " + now.getYear());
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
    }

    // 3. Add Days
    public static void addDays(int days) {
        LocalDate date = LocalDate.now();
        System.out.println("Date after adding days: " + date.plusDays(days));
    }

    // 4. Leap Year
    public static void checkLeapYear(int year) {
        boolean isLeap = Year.isLeap(year);
        System.out.println(year + " is a leap year: " + isLeap);
    }

    // 5. Calculate Age
    public static void calculateAge(String dob) {
        LocalDate birth = LocalDate.parse(dob);
        Period age = Period.between(birth, LocalDate.now());
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }

    // 6. Difference Between Dates
    public static void dateDifference(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Difference: " + Math.abs(days) + " days");
    }

    // 7. Day of Week
    public static void dayOfWeek(String date) {
        LocalDate d = LocalDate.parse(date);
        System.out.println("Day of week: " + d.getDayOfWeek());
    }

    // 8. String to Date
    public static void stringToDate(String input) {
        LocalDate date = LocalDate.parse(input);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Formatted: " + date.format(formatter));
    }

    // 9. Past, Present, Future
    public static void checkDatePosition(String dateInput) {
        LocalDate input = LocalDate.parse(dateInput);
        LocalDate today = LocalDate.now();
        if (input.isBefore(today)) System.out.println("Past Date");
        else if (input.isEqual(today)) System.out.println("Today");
        else System.out.println("Future Date");
    }

    // 10. Time Zones
    public static void multipleTimeZones() {
        System.out.println("India: " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("USA: " + ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println("Japan: " + ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
    }

    // 11. Countdown to Date
    public static void countdownToDate(String futureDate) {
        LocalDate future = LocalDate.parse(futureDate);
        long days = ChronoUnit.DAYS.between(LocalDate.now(), future);
        System.out.println("Days left: " + days);
    }

    // 12. Calendar Add/Subtract
    public static void calendarOps() {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current: " + cal.getTime());
        cal.add(Calendar.MONTH, 5);
        System.out.println("+5 Months: " + cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("-10 Days: " + cal.getTime());
    }

    // 13. Time Difference
    public static void timeDifference(String t1, String t2) {
        LocalTime time1 = LocalTime.parse(t1);
        LocalTime time2 = LocalTime.parse(t2);
        Duration d = Duration.between(time1, time2);
        System.out.println("Hours: " + Math.abs(d.toHours()) + ", Minutes: " + Math.abs(d.toMinutes() % 60));
    }

    // 14. List Dates Between
    public static void listDatesBetween(String start, String end) {
        LocalDate s = LocalDate.parse(start);
        LocalDate e = LocalDate.parse(end);
        while (!s.isAfter(e)) {
            System.out.println(s);
            s = s.plusDays(1);
        }
    }

    // 15. First & Last Day of Month
    public static void firstAndLastDay(int year, int month) {
        LocalDate first = LocalDate.of(year, month, 1);
        LocalDate last = first.withDayOfMonth(first.lengthOfMonth());
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    // Main for testing
    public static void main(String[] args) {
        currentDateTime();
        extractComponents();
        addDays(10);
        checkLeapYear(2024);
        calculateAge("2000-04-10");
        dateDifference("2024-04-01", "2025-04-01");
        dayOfWeek("2025-04-04");
        stringToDate("2025-04-04");
        checkDatePosition("2025-04-05");
        multipleTimeZones();
        countdownToDate("2025-12-31");
        calendarOps();
        timeDifference("10:15:00", "15:45:00");
        listDatesBetween("2025-04-01", "2025-04-05");
        firstAndLastDay(2025, 4);
    }
}
