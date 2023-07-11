import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        String msg = "";
        Scanner in = new Scanner(System.in);
        msg = SafeInput.prettyHeader(in, "Enter your message");
        System.out.println();
    }
}
