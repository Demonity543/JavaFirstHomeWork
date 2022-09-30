import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        int number, percent, result;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            number = sc.nextInt();

            System.out.println("Enter percent: ");
            percent = sc.nextInt();
        }

        result = number * percent / 100;

        System.out.println("Result: " + result);
    }
}
