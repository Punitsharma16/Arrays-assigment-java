import java.util.Scanner;

public class MohitAndArray {
    static void missingNum(int[] arr, int n) {
//            sum of n real numbers-->
            int sumOfAll = n * (n + 1) / 2;
//            sum of array-->
            int sumOfArr = 0;
            for(int i=1; i<=n-1; i++){
                sumOfArr += arr[i];
            }
            int missingNum = sumOfAll - sumOfArr;
        System.out.println(missingNum);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arr");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i=1; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        missingNum(arr,n);
    }
    }




