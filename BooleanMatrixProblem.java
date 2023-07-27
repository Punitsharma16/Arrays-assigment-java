import java.util.Scanner;

public class BooleanMatrixProblem {
    static boolean check1(int[][] arr, int row, int m){
        for(int j=0; j<m; j++){
            if(arr[row][j] == 1){
                return true;
            }
        }
        return false;
    }
    static void fillWith1(int[][] arr, int row,int m) {
        for (int j = 0; j<m; j++){
            arr[row][j] = 1;
        }
    }
    static void printArr(int[][] arr, int n, int m){
        for (int i=0; i<n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rows");
        int n = sc.nextInt();
        System.out.println("Enter the length of columns");
        int m = sc.nextInt();
        System.out.println("Enter the Array");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++) {
            if (check1(arr,i,m)){
                fillWith1(arr,i,m);
            }
        }
        printArr(arr,n,m);
    }
}
