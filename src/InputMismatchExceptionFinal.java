import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number1 = input.nextInt();
                System.out.print("Enter another integer: ");
                int number2 = input.nextInt();
                int result = number1 + number2;

                // Display the result
                System.out.println("The sum of these numbers are " + result);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                "Incorrect input: an integer is required");
                input.nextLine(); // Discard input
            }
        } while(continueInput);
    }
}
