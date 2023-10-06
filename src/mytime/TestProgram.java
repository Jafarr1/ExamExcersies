package mytime;
import java.time.LocalDate;

import java.util.Date;

import static mytime.DateUtil.dayOfWeek;

public class TestProgram {
    public static void main(String[] args) {
        new TestProgram().run();
    }

    private void run() {
        MyTime time = new MyTime(14,57,2023,10,4);
        System.out.println("Time as string: " + time.timeAsString());

        time.setHours(9);
        time.setMinutes(23);
        System.out.println("Updated time as string: " + time.timeAsString());

        LocalDate date = time.toLocalDate();

        DateUtil.DayOfWeek dayOfWeekEnum = DateUtil.dayOfWeek(date);
        System.out.println("Day of the week: " + dayOfWeekEnum);

        boolean isWorkDay = DateUtil.isWorkDay(date);
        System.out.println("Is it a workday? " + isWorkDay);
    }

}
