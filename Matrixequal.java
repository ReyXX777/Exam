import java.util.Scanner;
public class Matrixequal {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows and coloums of the matrix");
        int rows = in.nextInt();
        int column = in.nextInt();
        int [] [] matrix1 = new int [rows] [column];
        int  [] [] matrix2 = new int [rows][column];
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
boolean areequal = true;
for (int i = 0; i<rows;i++){
    for(int j =0; j<column;j++){
        if (matrix1[i][j] != matrix2[i][j]){
            areequal = false;
            break;
        }
    }
    if(!areequal){
        break;
    }
}
if(areequal){
    System.out.println("the matrix are equal");
}else {
    System.out.println("the matrix are not equal");
}
    }
}
