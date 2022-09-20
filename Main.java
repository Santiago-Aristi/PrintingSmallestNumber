import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter 3 different numbers to grab the smallest integer. \n");

        double a = askDouble(input, "Input the first number: ");
        double b = askDouble(input, "Input the second number: ");
        double c = askDouble(input, "Input the third number: ");

        System.out.println("\nThe three values entered are: " + a + ", " + b + ", " + c + ".\n");
        System.out.println("The smallest number you entered is: " + smallest(a, b, c) + "\n");
    }

    public static double smallest(double a, double b, double c){
        return Math.min(Math.min(a, b), c);
    }

    public static double askDouble(Scanner input, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return input.nextDouble();
            }catch (InputMismatchException ie) {
                System.out.println("Only numbers allowed to be entered. No letters or words!");
                input.nextLine();
            }
        }
    }
}
