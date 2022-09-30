import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        int number1, number2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            number1 = sc.nextInt();

            System.out.println("Enter second number: ");
            number2 = sc.nextInt();
        }

        if (number2 > number1) {
            for (int i = number1; i <= number2; i++) {
                for (int j = 1; j < 11; j++) {
                    System.out.println(i + "*" + j + "=" + i * j + ";\n");
                }
            }
        } else {
            for (int i = number2; i <= number1; i++) {
                for (int j = 1; j < 11; j++) {
                    System.out.println(i + "*" + j + "=" + i * j + ";\n");
                }
            }
        }

    }
}
