import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n) {
        int count = 0 , number = 1;

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=scanner.nextInt();

        System.out.println("Prime number of "+n+"th is : "+ nthPrime(n) );

    }
}
