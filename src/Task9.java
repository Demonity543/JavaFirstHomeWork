import java.lang.Math;
import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int zeros = 0, pos = 0, neg = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (20 - 0 + 1)) - 5;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                neg++;
            } else if (numbers[i] > 0) {
                pos++;
            } else if (numbers[i] == 0) {
                zeros++;
            }
        }

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Zeros in array: " + zeros);
        System.out.println("Positive numbers in array: " + pos);
        System.out.println("Negative numbers in array: " + neg);

    }
}
