import java.util.Scanner;
public class Multiplymatrix {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows and coloums of the matrix");
        int rows1 = in.nextInt();
        System.out.println("enter the column of first matrix");
        int column1 = in.nextInt();
        System.out.println("enter the rows of second matrix");
        int rows2 = in.nextInt();
        System.out.println("enter the column of second matrix");
        int column2 = in.nextInt();
        if (column1 != rows2){
System.out.println("matxix multiplication not allowed");
return;
        }
      int [] [] matrix1  = new int[rows1][column1];
      int [][] matrix2 = new int[rows2][column2];
      int [][] productmatrix = new int[rows1][column2];
      System.out.println("enter the elements of first matrix");
      for ( int i= 0; i< rows1;i++){
        for (int j =0;j<column2; j++){
            matrix1[i][j] = in.nextInt();
        }
      } 
      System.out.println("enter the elements of second matrix");
      for ( int i=0;i<rows2;i++){
        for ( int j = 0; j<column2; j++){
            matrix2 [i][j] = in.nextInt();
        }
      }
      for (int i =0; i<rows1;i++){
        for ( int j =0; j<column2;j++){
            productmatrix[i][j] = 0;
            for (int k =0; k<column2;k++){
                productmatrix[i][k] += matrix1[i][k] * matrix2[k][j];


            }
        }
      }
      System.out.println("the product matrix is");
      for ( int i =0;i<rows1;i++){
        for ( int j =0; j<column2;j++){
            System.out.print(productmatrix[i][j]);
        }
        System.out.println();
      }
      in.close();
    }
    
}
