import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 * @author Cagatay KARASU
 */

public class Main {
    public static void main(String[] args) {

        int number = Integer.parseInt(showInputDialog(null, "Enter a number please.",
                "## FIBONNACI ##", INFORMATION_MESSAGE));

        fib(number);
        fact(number);
    }

    public static void fib(int number) {

        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;

        System.out.println("First " + number + " of fibonacci numbers are :");
        for (int i = 1; i <= number; i++) {
            if (i != number) {
                System.out.print(firstNumber + " - ");
            }
            else {
                System.out.print(firstNumber + "\n");
            }

            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }

    public static void fact(int number) {
        int cross = 1;

        if (number <= 0) {
            showMessageDialog(null, "Wrong number", "ERROR!", WARNING_MESSAGE);
        }

        else {
            for (int i = 1; i <= number; i++) {
                cross *= i;
            }
            System.out.println(number + "! = " + cross);
        }
    }
}
