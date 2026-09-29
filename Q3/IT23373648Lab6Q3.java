import java.util.Scanner;

public class IT23373648Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while (number != -99) {
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumOfSquares += (double) number * number;
                count++;
            }
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        }

        if (count > 0) {
            double meanSquare = sumOfSquares / count;
            double rms = Math.sqrt(meanSquare);
            System.out.println();
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println();
            System.out.println("No positive numbers were entered.");
        }

        scanner.close();
    }
}