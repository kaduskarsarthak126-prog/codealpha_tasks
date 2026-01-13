import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int strength = 0;

        if (password.length() >= 8)
            strength++;

        if (password.matches(".*[A-Z].*"))
            strength++;

        if (password.matches(".*[a-z].*"))
            strength++;

        if (password.matches(".*[0-9].*"))
            strength++;

        if (password.matches(".*[!@#$%^&*()].*"))
            strength++;

        if (strength <= 2)
            System.out.println("Password Strength: WEAK");
        else if (strength <= 4)
            System.out.println("Password Strength: MEDIUM");
        else
            System.out.println("Password Strength: STRONG");

        sc.close();
    }
}
