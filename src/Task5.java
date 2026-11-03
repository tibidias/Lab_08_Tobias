import java.util.Scanner;
public class Task5 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String userSSN = InputHelper.getRegExString(scan, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + userSSN);
        String studentNum = InputHelper.getRegExString(scan, "Enter your Student M Number", "(M|m)\\d{5}");
        System.out.println("Your Student M Number is: " + studentNum);
        String menu = InputHelper.getRegExString(scan, "Menu: O - Open S - Save V - View Q - Quit", "[OoSsVvQq]");
        System.out.println("You choose: " + menu);
    }
}
