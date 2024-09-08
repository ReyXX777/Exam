import java.util.Scanner;
public class Lowermatrix {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows and columns of the matrix");
        int n = in.nextInt();
        int [][] matrix = new int[n][n];
        System.out.println("enter the elements of the matrix");
        for (int i =0; i<n;i++){
            for ( int j =0;j<n;j++){
                matrix [i][j] = in.nextInt();
            }
        }
        System.out.println("lower triangle matrix");
        for ( int i =0; i<n;i++){
            for (int j =0;j<n;j++){
                if (j>i){
                    System.out.print("0" + " ");
                }
                else { 
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
    
}
