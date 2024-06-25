import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestProduct {

    public static long findGreatestProduct(List<Integer> digits, int numAdjacent) {
        long maxProduct = 0;

        for (int i = 0; i <= digits.size() - numAdjacent; i++) {
            long product = 1;
            for (int j = 0; j < numAdjacent; j++) {
                product *= digits.get(i + j);
            }
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        return maxProduct;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        String number=scanner.nextLine();
        System.out.println("Enter the adjacent Number");
        int numAdjacent=scanner.nextInt();

        List<Integer> digits = new ArrayList<Integer>();
        for (char c : number.toCharArray()) {
            digits.add(Character.getNumericValue(c));
        }

        long result = findGreatestProduct(digits,numAdjacent);
    }
}
