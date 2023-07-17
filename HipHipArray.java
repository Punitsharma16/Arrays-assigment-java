import java.util.Scanner;
//You will be given an array of N numbers. Your task is to first reverse
// the array (the first number becomes last, 2nd number becomes 2nd from the last,
// and so on) and then print the sum of the
// numbers at even indices and print the product of the numbers at odd indices.
public class HipHipArray {
    static void reverse(int[] arr, int n){
        int[] reverseArr = new int[n];
        int length = n;
        for(int i=0; i<n; i++) {
            reverseArr[length - 1] = arr[i];
            length = length - 1;
        }
        for(int k=0; k<n; k++) {
            System.out.print(reverseArr[k]+" ");
        }
        System.out.println();
    }
    static void sumOfEven(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
            System.out.print(sum+" ");
    }
    static void product(int[] arr){
        int prod = 1;
        for(int i=0; i<arr.length; i++) {
            if (i % 2 == 1) {
                prod *= arr[i];
            }
        }
            System.out.println(prod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr,n);
        sumOfEven(arr);
        product(arr);
    }
}
