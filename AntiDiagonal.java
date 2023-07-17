import java.util.Scanner;
public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        findAntiDiagonal(arr, n, m);
        sc.close();
    }
    
    static void findAntiDiagonal(int[][] arr,int n,int m) {
        int col,row;
        for(int i=0;i<n;i++) {
            col = i;row = 0;
            while(col >= 0 && row < n) {
                System.out.print(arr[row][col]+" ");
                col--;
                row++;
            }
            System.out.println();
        }

        for(int i=1;i<n;i++) {
            row = i;col = n-1;
            while(row <n && col >= 0) {
                System.out.print(arr[row][col]+ " ");
                row++;
                col--;
            }
            System.out.println();
        }
    }
}