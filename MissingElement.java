public class MissingElement {
    public static void main (String[] args){
        int[] arr = {1,2,3,5,6,};
        int n = arr.length;
//        array ka sum nikal lete h

        int sum  = 0;
        for(int i=0; i<n-1; i++){

            sum = sum + arr[i];

        }

        int expectedsum = n* (n+1)/2;

//        aab missing element nikal lete h jo ki expectedsum - sum se niakl jayega

        int MissingElement = expectedsum - sum;
        System.out.println(" Missing element is :" + MissingElement);

    }
}
