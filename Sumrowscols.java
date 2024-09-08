import java.util.Scanner;
public class Sumrowscols {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows of the matrix");
        int rows = in.nextInt();
        System.out.println("enter the colomns of the matrix");
        int cols = in.nextInt();
        int [][] matrix = new int[rows][cols];
        System.out.println("enter the elements of the array");
        for ( int i =0; i<rows;i++){
            for (int j =0 ;j<cols;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("sum of each row");
        for ( int i =0;i<rows;i++){
            int sumrow = 0;
            for (int j =0 ; j<cols;j++){
                sumrow += matrix[i][j];
            }
            System.out.println("the sum of matrix"+ sumrow);
        }
        System.out.println("sum of the cols");
        for (int j =0;j<cols;j++){
            int sumcol =0;
            for (int i =0 ;i< rows;i++){
                sumcol += matrix[i][j];
            }
            System.out.println("the sum of cols"+ (j+1) + " ; "  + cols);
        }
        in.close();
    }
    
}
