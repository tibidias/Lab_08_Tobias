import java.util.Scanner;
public class Task3 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int userBYear = InputHelper.getRangeInt(scan, "Enter your birth year.", 1950, 2010);
        int userBMonth = InputHelper.getRangeInt(scan, "Enter your birthday month.", 1, 12);
        int userMonthDayMax = 0;
        if (userBMonth == 2){
            userMonthDayMax = 28;
        } else if (userBMonth == 1 || userBMonth == 3 || userBMonth == 5 || userBMonth == 7 || userBMonth == 8 || userBMonth == 10 || userBMonth == 12) {
            userMonthDayMax = 31;
        }else{
            userMonthDayMax = 30;
        }
        int userBDay = InputHelper.getRangeInt(scan, "Enter your birth day.", 1, userMonthDayMax);
        int userBHour = InputHelper.getRangeInt(scan, "Enter your birth hour.", 1, 24);
        int userBMin = InputHelper.getRangeInt(scan, "Enter your birth min.", 0, 59);

        System.out.println("Birthday:");
        System.out.printf("\n%5s%-4d", "Year: ", userBYear);
        System.out.printf("\n%5s%-4d", "Month: ", userBMonth);
        System.out.printf("\n%5s%-4d", "Day: ", userBDay);
        System.out.printf("\n%5s%-4d", "Hour: ", userBHour);
        System.out.printf("\n%5s%-4d", "Minute: ", userBMin);
    }
}
