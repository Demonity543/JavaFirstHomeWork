import java.util.*;;

public class Task3 {
    public static void main(String[] args) {
        int number1, number2, number3;
        String res;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            number1 = sc.nextInt();

            System.out.println("Enter second number: ");
            number2 = sc.nextInt();

            System.out.print("Enter third number: ");
            number3 = sc.nextInt();
        }

        res = Integer.toString(number1) + Integer.toString(number2) + Integer.toString(number3);

        System.out.println("Result: " + res);

    }
}
