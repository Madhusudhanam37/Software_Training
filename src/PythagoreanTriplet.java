import java.util.Scanner;

public class PythagoreanTriplet {

    public static void pyt(int sum) {
        boolean found = false;

        for (int a = 1; a < sum / 3; a++) {
            for (int b = a + 1; b < sum / 2; b++) {
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println("a=" + a + ", b=" + b + ", c=" + c);
                    System.out.println("The product abc is: " + (a * b * c));
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("No Pythagorean triplet found for the given sum.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum : ");
        int sum = scanner.nextInt();
        pyt(sum);

    }
}
