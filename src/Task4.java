import java.util.Scanner;
public class Task4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        double finalPrice = 0;
        do {
            double currentPrice = InputHelper.getRangeDouble(scan, "Enter the item price : $", 0.50, 9.50);
            finalPrice += currentPrice;
        }while(InputHelper.getYNConfirm(scan, "Do you want to continue?(Y/N)"));
        System.out.printf("\n%17s%4.2f", "Total cost is $: ", finalPrice);
    }
}
