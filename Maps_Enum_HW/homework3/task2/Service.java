package homework3.task2;

public class Service {

    public String getDaysInMonth(Month month, int year) {
        if (month == Month.FEBRUARY && year % 4 == 0) {
            month.setFebruaryDays();
        }
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
            System.out.println("There is no such date in this month.");
        }
        return "It's " + month.getHolidays().contains(day) + "!";
    }
}

