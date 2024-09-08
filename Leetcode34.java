import java.util.Scanner;
public class Leetcode34{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int n = in.nextInt();
        int [] [] matrix = new int[n][n];
        System.out.println("enter the elements of the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        rotate(matrix);
        System.out.println("the rotate array");
        for(int [] row:matrix){
            for(int val:row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
    public static void rotate(int [] [] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[j][i];
                matrix [j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for(int [] row:matrix){
            reverse(row);
        }
    }
    private static void reverse(int [] array){
        int start =0,end=array.length-1;
        while(start<end){
            int temp = array[start];
            array[start ]= array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}