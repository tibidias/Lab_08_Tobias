import java.util.Scanner;
public class InputHelper {
    //All methods should be public and static

    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String s;
        boolean valid = false;
        System.out.println(prompt);
        do {
            s = scan.nextLine();
            if (s.length() > 0){

                valid = true;
            } else {
                System.out.println("Error: Please try again. You entered a String of length 0");
            }
        } while (!valid);
        return s;
    }
    public static int getInt(Scanner scan, String prompt) {
        int x = 0;
        boolean valid = false;

        do{
            System.out.println(prompt);
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                valid = true;
            }else {
                System.out.println("Error: Try again. Please enter an integer value.");
            }
            scan.nextLine();
        }while(!valid);
        return x;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double x = 0;
        boolean valid = false;

        do{
            System.out.println(prompt);
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                valid = true;
            }else {
                System.out.println("Error: Try again. Please enter an double value.");
            }
            scan.nextLine();
        }while(!valid);
        return x;
    }

    public static int getRangeInt(Scanner scan, String prompt, int min, int max) {
        int x = 0;
        boolean valid = false;

        do {
            System.out.println(prompt);
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x >= min && x <= max) {
                    valid = true;
                }else {
                    System.out.println("Enter a number between your min and max range");
                }
            }else {
                System.out.println("Enter an integer value.");
            }
            scan.nextLine();
        }while(!valid);
        return x;

    }

    public static double getRangeDouble(Scanner scan, String prompt, double min, double max) {
        double x = 0;
        boolean valid = false;

        do {
            System.out.println(prompt);
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                if (x >= min && x <= max) {
                    valid = true;
                }else {
                    System.out.println("Enter a number between your min and max range");
                }
            }else {
                System.out.println("Enter a double value.");
            }
            scan.nextLine();
        }while(!valid);
        return x;

    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt){
        int x = 0;
        boolean valid = false;

        do{
            System.out.println(prompt);
            if(scan.hasNextInt()){
                x = scan.nextInt();
                if(x > 0){
                    valid = true;
                }else{
                    System.out.println("Enter a value greater than 0");
                }
            }else{
                System.out.println("Enter an integer value");
            }
            scan.nextLine();
        }while(!valid);
        return x;
    }

    public static boolean getYNConfirm(Scanner scan, String prompt){
        boolean valid = false;
        String userInput = "";
        boolean YN = false;

        do{
            System.out.println(prompt);
            if(scan.hasNextLine()){
                userInput = scan.nextLine();
                if (userInput.equalsIgnoreCase("N") || (userInput.equalsIgnoreCase("Y"))) {
                    if (userInput.equalsIgnoreCase("Y")) {
                        YN = true;
                        valid = true;
                    }else {
                        valid = true;
                    }
                }
            }
        }while(!valid);
        return YN;
    }

    public static String getRegExString(Scanner scan, String prompt, String regexPattern) {
        String s = "";
        Boolean valid = false;
        do{
            System.out.println(prompt);
            s = scan.nextLine();
            if (s.matches(regexPattern)){
                valid = true;
            }else {
                System.out.println("Error: your answer must match the specified pattern.");
            }
        }while(!valid);
        return s;
    }
}
