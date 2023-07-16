import java.util.*;
public class Transpose {
        static void transpose(int[][] arr , int n){
            int[][] transposeArr = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    transposeArr[i][j] = arr[j][i];
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(transposeArr[i][j]+" ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int n = sc.nextInt();
            System.out.println("Enter the matrix array");
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            transpose(arr, n);
        }
    }

