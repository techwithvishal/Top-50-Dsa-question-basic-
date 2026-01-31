public class largestelementwithindex {
    public static void main(String[] args) {
        // Array khud define kiya
        int[] arr = {10, 25, 7, 30, 18};

        // Assume first element is largest
        int largest = arr[0];
        int index = 0;

        // Traverse array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i; // update index
            }
        }

        // Output
        System.out.println("Largest element = " + largest);
        System.out.println("Index of largest element = " + index);
    }
}