import java.util.Scanner;
public class Task6{
    static void main() {
        Scanner scan = new Scanner(System.in);
        double userTemp = celsiusToFahrenheit(InputHelper.getDouble(scan, "Enter a temperature in Celsius:"));
        System.out.printf( "\n%20s%5.2f", "Your temp in degrees Fahrenheit is: ", userTemp);
    }
        public static double celsiusToFahrenheit(double Celsius) {
            double fahrenheit = (Celsius * 1.8) + 32;
            return fahrenheit;
    }

}
