import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        float meter;
        int key;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter meter ");
            meter = sc.nextFloat();
            System.out.println("1.Convert to mile\n2.Convert to inch\n3.Convert to yards");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Mile:" + meter * 0.000621371);
                    break;
                case 2:
                    System.out.println("Inch: " + meter * 39.37);
                    break;
                case 3:
                    System.out.println("Yards: " + meter * 1.094);
                    break;

                default:
                    System.out.println("Not operation");
                    break;
            }
        }
    }
}
