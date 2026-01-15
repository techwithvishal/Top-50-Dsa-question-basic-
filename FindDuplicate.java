import java.util.Scanner;
class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        
        // int[] arr = {10, 20, 30, 20, 40, 10, 50};

        System.out.println("Duplicate elements are:");

        // outer loop
        for (int i = 0; i < arr.length; i++) {

            // inner loop (i ke baad se start)
            for (int j = i + 1; j < arr.length; j++) {

                // duplicate check
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // same element bar-bar print na ho
                }
            }
        }
    }
}
