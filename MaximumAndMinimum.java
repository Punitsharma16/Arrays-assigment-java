import java.util.*;
public class MaximumAndMinimum {
        //    function for maximum
        static int maximum(int[] arr){
            int n = arr.length;
            int max = arr[0];
            for(int i=0; i<n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
        //funtion for minimum
        static int minimum(int[] arr){
            int n = arr.length;
            int min = arr[0];
            for(int i=0; i<n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int n = sc.nextInt();
            System.out.println("Enter the array");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
//            result
            System.out.println(maximum(arr) + " " + minimum(arr));
        }
    }

