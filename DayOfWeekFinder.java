import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFinder {
    public static int getDayOfWeek(int d, int m, int y) {
        LocalDate date = LocalDate.of(y, m, d);
        DayOfWeek day = date.getDayOfWeek();  // e.g., MONDAY
        return day.getValue() % 7;  // Convert to 0=Sunday, 1=Monday, ...
    }

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(30, 8, 2010)); // 1 (Monday)
        System.out.println(getDayOfWeek(15, 6, 1995)); // 4 (Thursday)
        System.out.println(getDayOfWeek(29, 2, 2016)); // 1 (Monday)
    }
}
