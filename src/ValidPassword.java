import java.util.Scanner;

public class ValidPassword {

    public boolean passwordValidation(String password){
        if (password.length() < 8) {
            return false;
        }


        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = scanner.nextLine();

        ValidPassword validPassword=new ValidPassword();
        if (validPassword.passwordValidation(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is not valid.");
        }

    }
}
