import java.util.Scanner;
public class Matrixsum1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows and coloums of the matrix");
        int rows = in.nextInt();
        int column = in.nextInt();
        int [] [] matrix1 = new int [rows] [column];
        int  [] [] matrix2 = new int [rows][column];
        int [][] summatrix = new int [rows][column];
        System.out.println("enter the elements of first matrix");
        for (int i = 0; i<rows;i++){
            for ( int j = 0; j< column;j++){
matrix1[i][j] = in.nextInt();
            }
        } 
        System.out.println("enter the elements of second matrix");
        for(int i =0; i< rows; i++){
            for ( int j =0; j<column; j++){
                matrix2 [i][j] = in.nextInt();
            }
        }
for (int i =0; i<rows;i++){
for (int j = 0; j<column; j++){
    summatrix [i] [j] = matrix1[i][j] + matrix2[i][j];
}
}
for (int i = 0; i<rows;i++){
    for ( int j =0; j<column; j++){
        System.out.print(summatrix[i][j] + " ");
    }
    System.out.println();
}
in.close();
    }
    
}
