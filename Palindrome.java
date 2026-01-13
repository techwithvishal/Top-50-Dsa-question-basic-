  import java.util.Scanner;
public class Palindrome {
  

    public static void main(String[] args) {

        // Step 1: Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Step 2: Take string input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 3: Variable to store reverse string
        String reverse = "";

        // Step 4: Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Step 5: Compare original and reverse
        if (str.equals(reverse)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        // Step 6: Close scanner
        sc.close();
    }
}

