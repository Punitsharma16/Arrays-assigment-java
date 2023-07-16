import java.util.*;
public class maxNum {
    //    function for max numbers
    static void maxThreeNum(int[] arr){
        int N = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[N-1]+" "+arr[N-2]+" "+arr[N-3]);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maxThreeNum(arr);
    }
}

