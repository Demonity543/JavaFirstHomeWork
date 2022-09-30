import java.util.*;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        int key;
        System.out.println("Simple array:");
        for (int i = 0; i < 15; i++) {
            array.add((int) Math.round((Math.random() * 100) - 50));
        }

        System.out.println(array.toString());

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter key sort:\n1.Decreasing\n2.Increase");
            key = sc.nextInt();
        }

        switch (key) {
            case 1:
                System.out.print("Decreasing sort array");
                List<Integer> sorted = array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                System.out.println(sorted.toString());
                break;
            case 2:
                System.out.print("Increase sort array");
                List<Integer> sorted2 = array.stream().sorted().collect(Collectors.toList());
                System.out.println(sorted2.toString());
                break;

            default:
                System.out.println("Not operation");
                break;
        }

    }
}
