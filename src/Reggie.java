import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        String ssn = "";
        String mNumber = "";
        String menuChoice = "";
        Scanner in = new Scanner(System.in);
        ssn = SafeInput.getRegExString(in, "Enter your SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(in, "Enter your UC M number: ", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Choose an option [O, S, V, Q]: ", "^[OoSsVvQq]$");
        System.out.println("\nYour SSN is : " + ssn + "\nYour UC M number is : " + mNumber + "\nYour menu choice is : " + menuChoice);
    }
}
