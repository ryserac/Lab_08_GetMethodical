import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        double itemPrice;
        double sumPrice = 0;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        do {
            itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item?", .5, 10);
            sumPrice = sumPrice + itemPrice;
            done = SafeInput.getYNConfirm(in, "Would you like to enter another item?");
        }
        while (done);
        System.out.printf("\nYour total is: $" + "%.2f", sumPrice);
    }
}
