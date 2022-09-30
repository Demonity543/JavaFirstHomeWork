import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[30];

        System.out.println("Simple array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100) - 50);
            System.out.print(array[i] + " ");
        }

        List<Integer> evenNumber = new ArrayList<Integer>();
        List<Integer> oddNumber = new ArrayList<Integer>();
        List<Integer> negNumber = new ArrayList<Integer>();
        List<Integer> posNumber = new ArrayList<Integer>();

        for (int num : array) {
            if (num % 2 == 0) {
                evenNumber.add(num);
            } else {
                oddNumber.add(num);
            }

            if (num > 0) {
                posNumber.add(num);
            } else {
                negNumber.add(num);
            }
        }

        System.out.println("\n\nEven numbers:" + evenNumber.toString());
        System.out.println("Odd numbers:" + oddNumber.toString());
        System.out.println("Negative numbers:" + negNumber.toString());
        System.out.println("Positive numbers:" + posNumber.toString());

    }
}
