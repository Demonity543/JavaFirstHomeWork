import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int month;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter month number");
            month = sc.nextInt();
        }
        switch (month) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("No month");
                break;
        }
    }
}
