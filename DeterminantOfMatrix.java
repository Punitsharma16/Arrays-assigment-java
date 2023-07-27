import java.util.Scanner;

public class DeterminantOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Elements Of The Arr");
        int[][] arr = new int[2][2];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int determinant = arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];
        System.out.println(determinant);
    }
}
