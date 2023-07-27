import java.util.Scanner;

public class Rotate90Degree {
    static int[][] rotateArr90(int[][] arr, int n){
//        create New array to store the rotated elements
        int[][] rotatedArr = new int[n][n];
        for(int i=0; i<n; i++){
//            here I is used for rows
            for(int j=0; j<n; j++){
//                here j is used for columns
                rotatedArr[j][n-i-1] = arr[i][j];
            }
        }
        return rotatedArr;
    }
//    print array function
    static void printArr(int[][] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length of n*n Arr");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] Rotate90 = rotateArr90(arr,n);
        printArr(Rotate90,n);

    }
}
