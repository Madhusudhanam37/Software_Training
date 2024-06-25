import java.util.Scanner;

public class CountNumber {
    public static int countDigits(int number) {

        String numberStr = String.valueOf(number);
        int digitCount = numberStr.length();
        return digitCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int inputNumber = scanner.nextInt();
        int numberOfDigits = countDigits(inputNumber);

        System.out.println("Number of digits: " + numberOfDigits);
    }
}
