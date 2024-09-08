import java.util.Scanner;
public class Identitymatrix {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows and cols of the matrix of same size");
        int size = in.nextInt();
        int [][] matrix = new int[size][size];
        System.out.println("enter the elements of the matrix");
        for ( int i=0;i<size;i++){
            for ( int j=0;j<size;j++){
                matrix[i][j] = in.nextInt();
            }
        } 
        boolean isidentity = true;
        for ( int i=0;i<size;i++){
            for (int j =0;j<size;j++){
                if (i==j && matrix[i][j] !=1){
                    isidentity = false;
                    break;
                }else if (i!=j&& matrix[i][j]!=0){
                    isidentity = false;
                    break;
                }
            }
        }
        if (isidentity){
            System.out.println("it is a tranpose matrix");
        }else {
            System.out.println("it is not a transpose matrix");
        }
    }
    
}
