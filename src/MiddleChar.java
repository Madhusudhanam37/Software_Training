import java.util.Scanner;

public class MiddleChar {
    public static void middleCharacter(String str) {
        int length = str.length();
        if (length == 0) {
            System.out.println("The string is empty.");
            return;
        }

        int middle = length / 2;
        if (length % 2 == 0) {
            System.out.println("The middle character in even string: " + str.charAt(middle - 1));
        } else {
            System.out.println("The middle characters in odd string: " + str.charAt(middle - 1) + str.charAt(middle));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.nextLine();
        middleCharacter(input);

    }
}
