import java.util.Scanner;
class SelectionSortString {

    // Program start hota hai yahan se
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of name that you want to input :");
        int a = sc.nextInt();


        // String array declare kiya (names store karne ke liye)
        String[] names = new String[a];


        System.out.println("enter names in string array :");
        for(int i=0; i<names.length; i++){
            names[i] =sc.nextLine();
        }


        // Array ka size n me store kiya
        int n = names.length;

        // Outer loop -> har pass me ek position fix karega
        for (int i = 0; i < n - 1; i++) {

            // Assume kar liya ki current index pe minimum (alphabetically) name hai
            int minIndex = i;

            // Inner loop -> unsorted part me smallest name search karega
            for (int j = i + 1; j < n; j++) {

                // compareTo() se strings compare kar rahe hain
                // Agar names[j] chhota hai names[minIndex] se
                if (names[j].compareTo(names[minIndex]) < 0) {

                    // To minIndex update kar denge
                    minIndex = j;
                }
            }

            // Swap -> smallest name ko correct position pe laane ke liye
            String temp = names[minIndex]; // temporary variable me value store
            names[minIndex] = names[i];    // current position pe smallest name
            names[i] = temp;               // temp wali value wapas daali
        }

        // Sorted array print kar rahe hain (normal for loop)
        System.out.print("Sorted Names: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
