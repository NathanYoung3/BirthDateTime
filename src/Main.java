import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "What year were you born?", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "What month were you born?", 1, 12);
        int maxDay = 0;
        if (month == 2) {
            if (year % 4 == 0) {//leap years
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxDay = 31;
        } else {
            maxDay = 30;
        }
        int day = InputHelper.getRangedInt(scan, "What day were you born?", 1, maxDay);
        int hour = InputHelper.getRangedInt(scan, "What hour were you born?", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "What minute were you born?", 1, 60);

        System.out.printf("%-10s %7d", "Year:", year);
        System.out.printf("\n%-10s %7d", "Month:", month);
        System.out.printf("\n%-10s %7d", "Day:", day);
        System.out.printf("\n%-10s %7d", "Hour:", hour);
        System.out.printf("\n%-10s %7d", "Minute:", minute);
    }
}