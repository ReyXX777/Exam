import java.util.Scanner;
import java.util.Arrays;
public class Leetcode35 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows of the matrix");
        int rows = in.nextInt();
        System.out.println("enter the column number");
        int cols = in.nextInt();
        int [][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] =in.nextInt();
            }
        }
        setzeroes(matrix);
        System.out.println("modified matrix");
        for(int [] row:matrix ){
System.out.println(Arrays.toString(row));
        }
        

    }
    public static void setzeroes(int[][] matrix){
        boolean[] zeroesrows = new boolean[matrix.length];
        boolean [] zeroescols = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    zeroescols[j] = true;
                    zeroesrows[i] = true;
                }
            }
        }
    }
    
}
