import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        int size;
        char symbol;
        int key;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length array");
            size = sc.nextInt();

            System.out.println("Enter symbol");
            symbol = sc.next().charAt(0);

            System.out.println("Enter number line\n1.Horizontally\n2.Vertically");
            key = sc.nextInt();
        }
        char[] array = new char[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = symbol;
        }

        switch (key) {
            case 1:
                System.out.println("Array:" + Arrays.toString(array));
                break;
            case 2:
                System.out.println("Array:\n");
                for (char c : array) {
                    System.out.println(c);
                }
                break;

            default:
                System.out.println("Not operation");
                break;
        }

    }
}
