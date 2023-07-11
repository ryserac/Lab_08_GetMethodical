import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int favInt;
        double favDouble;
        Scanner in = new Scanner(System.in);
        favInt = SafeInput.getInt(in, "What is your fav integer?");
        System.out.println("Your favorite integer is " + favInt);
        favDouble = SafeInput.getDouble(in, "What is your fav double?");
        System.out.println("Your favorite double is " + favDouble);
    }
}
