package mytime;
import java.time.LocalDate;

public class DateUtil {


    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static DayOfWeek dayOfWeek(LocalDate date) {
        java.time.DayOfWeek javaDayOfWeek = date.getDayOfWeek();

        switch (javaDayOfWeek) {
            case MONDAY:
                return DayOfWeek.MONDAY;
            case TUESDAY:
                return DayOfWeek.TUESDAY;
            case WEDNESDAY:
                return DayOfWeek.WEDNESDAY;
            case THURSDAY:
                return DayOfWeek.THURSDAY;
            case FRIDAY:
                return DayOfWeek.FRIDAY;
            case SATURDAY:
                return DayOfWeek.SATURDAY;
            case SUNDAY:
                return DayOfWeek.SUNDAY;
            default:
                throw new IllegalArgumentException("Invalid day of the week.");
        }


    }

    public static boolean isWorkDay(LocalDate date) {
        DayOfWeek dayOfWeek = dayOfWeek(date);
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
}
