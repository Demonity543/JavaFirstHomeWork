import java.util.*;
import java.util.stream.IntStream;

public class Task7 {
    public static void main(String[] args) {
        int startArr, endArr;
        int[] numbers;
        ArrayList<Integer> notEvenNumbers = new ArrayList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter start number ");
            startArr = sc.nextInt();

            System.out.println("Enter end number ");
            endArr = sc.nextInt();
        }

        if (startArr < endArr) {
            numbers = IntStream.range(startArr, endArr).toArray();
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    notEvenNumbers.add(numbers[i]);
                }
            }
            System.out.println("Result:" + notEvenNumbers.toString());

        } else {
            numbers = IntStream.range(endArr, startArr).toArray();
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    notEvenNumbers.add(numbers[i]);
                }
            }
            System.out.println("Result:" + notEvenNumbers.toString());
        }

    }

}
