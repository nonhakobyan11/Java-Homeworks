package homework3.task2;
import static java.time.Year.isLeap;

public class Service {

    public void traverseAndPrintAllMonthNames() {
        System.out.println("Months of the year are:");
        for (Month month : Month.values()) {
            System.out.println(month);
        }
    }

    public boolean checkLeapOrNot(int year){
        if (isLeap(year)){
            Month.FEBRUARY.setFebruaryDaysForLeapYear();
            return true;
        }
        return false;
    }

    public String getDaysInMonth(Month month) {
        return "\nThe number of days in " + month + " is " + month.getDays();
    }

    public String getNumberOfHolidaysInMonth(Month month){
        int count = 0;
        for (Integer i : month.getHolidays()){
            count++ ;
        }
        return "\nThe number of holidays in " + month + " is " + count;
    }

    public String checkHolidayOrNot(Month month, int day){
        System.out.println("\nLet's see if " + month + " " + day + " is a holiday or not. ");
        if(day < 1 || day >= month.getDays()){
            return "There is no such date in this month." ;
        }
        return "It's " + month.getHolidays().contains(day) + "!";
    }
}

