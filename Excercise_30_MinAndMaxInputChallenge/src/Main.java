import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int enteredNumber;
        int minNumber = 0;
        int maxNumber = 0;
        boolean firstNumberEntered = false;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                System.out.println();
                System.out.println("Minimum number = " + minNumber);
                System.out.println("Maximum number = " + maxNumber);
                break;

            } else {

                enteredNumber = scanner.nextInt();

                if (!firstNumberEntered) {
                    minNumber = enteredNumber;
                    maxNumber = enteredNumber;
                    firstNumberEntered = true;
                }

                if (enteredNumber > maxNumber) {
                    maxNumber = enteredNumber;

                } else if (enteredNumber < minNumber) {
                    minNumber = enteredNumber;
                }
            }
            scanner.nextLine();
        }
        scanner.close(); // <== NE ZABORAVI!
    }
}
