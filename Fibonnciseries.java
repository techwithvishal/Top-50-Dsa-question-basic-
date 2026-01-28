
import java.util.Scanner;

public class Fibonnciseries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kite term chaiye ...?");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
