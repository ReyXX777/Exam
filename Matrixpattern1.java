import java.util.Scanner;
public class Matrixpattern1 {
    public static void main(String [] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int size = in.nextInt();
        int [] [] pattern1 = new int[size][size];
        System.out.println("enter value for the matrix");
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                pattern1[i][j] = in.nextInt();
            }
        }
        System.out.println("the matrix you entered is");
        for (int [] row : pattern1){
            for (int value : row){
                System.out.print(value);
            }
            System.out.println();
        }
        in.close();
    }
    
}
