import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        int year;
        int month;
        int day;
        int dayChange = 0;
        int hour;
        int minute;
        Scanner in = new Scanner(System.in);
        year = SafeInput.getRangedInt(in, "What is your birth year?", 1950, 2015);
        month = SafeInput.getRangedInt(in, "What is your birth month?", 1, 12);
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                dayChange = 31;
                break;
            case 4, 6, 9, 11:
                dayChange = 30;
                break;
            case 2:
                if (year % 4 ==0) {
                    dayChange = 29;
                }
                else {
                    dayChange = 28;
                }
                break;
        }
        day = SafeInput.getRangedInt(in, "What is your birth day?", 1, dayChange);
        hour = SafeInput.getRangedInt(in, "What is your birth hour?", 1, 24);
        minute = SafeInput.getRangedInt(in, "What is your birth minute?", 0, 59);
        System.out.println("\nYour birth date is " + month + "/" + day + "/" + year + " " + hour + "hr " + minute + "min");
    }
}
