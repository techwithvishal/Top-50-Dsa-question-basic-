import java.sql.SQLOutput;
import java.util.Scanner;

public class Missingelem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int arr1 [] = new int[n];
        System.out.println("Enter the elements of array :");
        for(int i =0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int expectedSum = (n+1) * (n+2) / 2;

        int actualSum = 0;
        for(int i=0; i<n; i++){
            actualSum += arr1[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing element is: " + missing);
    }
        }
        //

