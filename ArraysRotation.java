import java.util.Scanner;

public class ArraysRotation {
    static void Rotate(int[] arr, int n, int k){
        for(int i=0; i<k; i++){
            int temp = arr[0];
            for(int j=0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the numbers of rotation");
        int rotate = sc.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Rotate(arr,n, rotate);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
