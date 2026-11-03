import java.util.Scanner;
public class Task1 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String userName = InputHelper.getNonZeroLenString(scan, "Enter a username.");
        System.out.println("The username you entered is: " + userName + ".");
    }
}
