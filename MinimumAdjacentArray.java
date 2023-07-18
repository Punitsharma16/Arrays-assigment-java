import java.util.Scanner;

public class MinimumAdjacentArray {
    static void absoluteDifference(int[] arr, int n){
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int diff = Math.abs(arr[i] - arr[(i + 1) % n]);
            minDiff = Math.min(minDiff,diff);
        }
        System.out.println(minDiff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        absoluteDifference(arr,n);
    }
}
