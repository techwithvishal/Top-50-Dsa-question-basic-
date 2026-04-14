import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // size input lo
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // input lena
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print karna
        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}