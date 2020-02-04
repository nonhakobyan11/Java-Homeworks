package homework3.task2;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.traverseAndPrintAllMonthNames();
        System.out.println();
        System.out.println(Month.APRIL + "'s holidays are " + Month.APRIL.getHolidays());
        service.checkLeapOrNot(2020);
        System.out.println(service.getDaysInMonth(Month.FEBRUARY));
        System.out.println(service.getDaysInMonth(Month.MARCH));
        System.out.println(service.getNumberOfHolidaysInMonth(Month.JANUARY));
        System.out.println(service.checkHolidayOrNot(Month.MARCH, 8));
        System.out.println(service.checkHolidayOrNot(Month.MARCH, 21));

    }
}
