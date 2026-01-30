import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime or not:");
        int num = sc.nextInt();

        boolean isPrime = true; // by default assume number is prime

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // divisor found → not prime
                    break; // no need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}