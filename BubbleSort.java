// 🔹 Bubble Sort (Loop ka Theoretical Explanation)
// 1️⃣ First for loop (Outer loop)

// Ye loop passes ke liye hota hai

// Har pass me ek element apni correct position pe pahunch jata hai

// Isliye loop n-1 baar chalta hai

// Example:

//        1st pass → largest element last me

// 2nd pass → second largest element second last me

// 👉 Outer loop = kitni baar array ko traverse karna hai

// 2️⃣ Second for loop (Inner loop)

// Ye loop adjacent elements compare karne ke liye hota hai

// arr[j] aur arr[j+1] ko compare karta hai

// Agar left element bada ho, to swap karta hai

// n-1-i isliye likhte hain kyunki last ke elements already sorted hote hain

// 👉 Inner loop = comparison + swapping

// 3️⃣ temp variable

// temp ek temporary variable hai

// Swap ke time value ko temporarily store karne ke liye use hota hai

// Direct swap possible nahi hota, isliye temp use karte hain

// Example:

// temp = arr[j];
// arr[j] = arr[j+1];
// arr[j+1] = temp;


// 👉 temp = data loss se bachane ke liye

// ✅ One-line Summary (Interview ke liye)

// Outer loop → passes control karta hai

// Inner loop → adjacent elements compare & swap karta hai

// temp → swapping ke time value hold karta hai



class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {55, 32, 44, 25, 16};
//        int n = arr.length;

        // Bubble Sort Logic
        for (int i = 0; i < arr.length - 1; i++) {        // passes
            for (int j = 0; j < arr.length - 1 - i; j++) { // comparison
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
