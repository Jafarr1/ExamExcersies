package mytime;

import java.time.LocalDate;

public class MyTime {
    private int hours;
    private int minutes;
    private int year;
    private int month;
    private int date;


    public MyTime(int hours, int minutes, int year, int month, int date) {
        this.hours = hours;
        this.minutes = minutes;
        this.year = year;
        this.month = month;
        this.date = date;
    }


    public String timeAsString() {
        return String.format("%04d-%02d-%02d %02d:%02d", year, month, date, hours, minutes);

    }

    public int getHours() {
        return this.hours;

    }

    public int getMinutes() {
        return this.minutes;

    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth() {
        this.month = month;

    }

    public int getDate() {
        return this.date;
    }

    public int getYear() {
        return this.year;
    }

    public void setDate() {
        this.date = date;
    }

    public void setYear() {
        this.year = year;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public LocalDate toLocalDate() {
        return LocalDate.of(year, month, date);


    }
}
