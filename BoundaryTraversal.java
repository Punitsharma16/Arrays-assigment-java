import java.util.Scanner;

public class BoundaryTraversal {
    static void boundaryTraversal(int[][] arr, int m, int n){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==n-1 || i==m-1 || j==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row");
        int m = sc.nextInt();
        System.out.println("Enter the length of column");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boundaryTraversal(arr,m,n);
    }
}
