import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "What is your first name?");
        lastName = SafeInput.getNonZeroLenString(in, "What is your last name?");
        System.out.println("\nYour name is " + firstName + " " + lastName);
    }
}
