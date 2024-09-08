import java.util.Scanner;
public class Frequencymatrix {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows of the matrix");
        int rows = in.nextInt();
        System.out.println("enter the coloumn of the matrix");
        int cols = in.nextInt();
        int [][] matrix = new int[rows][cols];
        for ( int i =0;i<rows;i++){
            for(int j =0; j< cols ;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int oddcount = 0;
        int evencount = 0;
        for (int i =0;i<rows;i++){
            for ( int j =0;j<cols;j++){
                if (matrix[i][j] %2 ==0){
                    evencount++;
                }else{
                    oddcount++;
                }
            }
        }
        System.out.println("the even frequency is" + evencount);
        System.out.println("the odd frequency of elements is" + oddcount);
        in.close();
    }
    
}
