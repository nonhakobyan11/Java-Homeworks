package homework3.task2;

import java.util.ArrayList;
import java.util.Arrays;

public enum Month {
    JANUARY(31, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 28))),
    FEBRUARY(28, new ArrayList<>()),
    MARCH(31, new ArrayList<>(Arrays.asList(8))),
    APRIL(30, new ArrayList<>(Arrays.asList(7, 24))),
    MAY(31, new ArrayList<>(Arrays.asList(1, 9, 28))),
    JUNE(30, new ArrayList<>(Arrays.asList(1))),
    JULY(31, new ArrayList<>(Arrays.asList(5))),
    AUGUST(31, new ArrayList<>()),
    SEPTEMBER(30, new ArrayList<>(Arrays.asList(21))),
    OCTOBER(31, new ArrayList<>()),
    NOVEMBER(30, new ArrayList<>()),
    DECEMBER(31, new ArrayList<>(Arrays.asList(31)));

    private int days;
    private final ArrayList<Integer> holidays;

    Month(int days, ArrayList<Integer> holidays) {
        this.days = days;
        this.holidays = holidays;
    }

    public ArrayList<Integer> getHolidays() {
        return holidays;
    }

    public void setFebruaryDays() {
        days = 29;
    }

    public int getDays() {
        return days;
    }

}
