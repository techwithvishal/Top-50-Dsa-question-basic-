import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5};

        int i = 0;
        int j = arr.length-1;

        // now we will reverse the array while loop lagayenge
        while(i<j){
            int temp = arr[i];
            arr[i] =  arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(" Reversed Array is :");
            for(int k =0; k<arr.length; k++){
                System.out.print(arr[k] + " ");



        }

    }
}
