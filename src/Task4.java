import java.util.*;

public class Task4 {
    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static long swapDigits(int a) {
        char[] array = Integer.toString(a).toCharArray();
        swap(array, 0, 5);
        swap(array, 1, 4);
        return Long.parseLong(String.valueOf(array));
    }

    public static void main(String[] args) {

        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a six-digital number: ");
            number = sc.nextInt();
        }
        System.out.println("Result: " + swapDigits(number));

    }
}
