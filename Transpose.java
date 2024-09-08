import java.util.Scanner;
public class Transpose {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows ");
        int rows = in.nextInt();
        System.out.println("enter the coloumn");
        int cols = in.nextInt();
        int [][] matrix = new int[rows][cols];
        System.out.println("enter the elements of the array");
        for (int i =0; i<rows;i++){
            for (int j =0;j<cols;j++){
                matrix[i][j] = in.nextInt();
            }
        }
       System.out.println("the original matrix");
       for (int i = 0; i<rows; i++){
        for (int j = 0; j<cols;j++){
            matrix[i][j] = in.nextInt();
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
       } 
        int [][] transpose = new int[rows][cols];
        for (int i =0; i<rows;i++){
            for ( int j =0;j<cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("the transpose matrix is");
        for (int i =0; i<rows;i++){
            for (int j =0;j<cols;j++){
       System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
in.close();
    }
    
}
