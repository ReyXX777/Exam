import java.util.Scanner;
public class Sparsematrix {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = in.nextInt();
        System.out.println("enter cols");
        int cols = in.nextInt();
        int [][] matrix = new int[rows][cols];
        System.out.println("enter the elements");
        for (int i =0; i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int zeroescount =0;
        int totalelements = rows * cols;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (matrix[i][j] == 0){
                    zeroescount++;
                }
            }
        }
if (zeroescount>totalelements/2){
    System.out.println("it is a sparse matrix");
}else {
    System.out.println("it is not a sparse matrix");
}
in.close();
    }
    
}
