import java.util.Scanner;

public class SumOfPrimeNumbers {

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

    public static void printPrimesBelow(int n) {
        int sum=0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scanner.nextInt();
        printPrimesBelow(n);

    }
}
