import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int blank;
        String msg = "";
        System.out.print("Enter your message: ");
        msg = in.nextLine();
        for (int row = 1; row <= 1; row ++) {
            for (int col = 1; col <= 60; col++) {
                System.out.printf("*", row * col);
            }
            System.out.println();
        }
        for (int row = 1; row <= 1; row ++) {
            for (int col = 1; col <= 3; col++) {
                System.out.printf("*", row * col);
            }
            blank = (54 - msg.length()) / 2;
            for (int col = 1; col <= blank; col++) {
                System.out.printf(" ", row * col);
            }
            System.out.printf(msg);
            if (msg.length() % 2 == 0) {
                for (int col = 1; col <= blank; col++) {
                    System.out.printf(" ", row * col);
                }
            }
            else {
                for (int col = 0; col <= blank; col++) {
                    System.out.printf(" ", row * col);
                }
            }
            for (int col = 58; col <= 60; col++) {
                System.out.printf("*", row * col);
            }
            System.out.println();
        }
        for (int row = 1; row <= 1; row ++) {
            for (int col = 1; col <= 60; col++) {
                System.out.printf("*", row * col);
            }
            System.out.println();
        }
    }
}