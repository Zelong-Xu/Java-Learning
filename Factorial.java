import java.util.Scanner;

public class Factorial {

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
};
