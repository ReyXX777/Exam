import java.util.Scanner;
import java.util.Arrays;
public class Leetcode36 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter thr rows");
        int rows = in.nextInt();
        System.out.println("enter the cols");
        int cols = in.nextInt();
        int [][] board = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                board[i][j] = in.nextInt();
            }

        }
        game(board);
        System.out.println("next state of board");
        for(int [] row:board){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void game(int [][] board){
        int rows = board.length;
        int cols =board[0].length;
        int [][] nextstate = new int[rows][cols];
        int [] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int liveneighbours = 0;
                for(int k=0;k<8;k++){
                    int ni = i +dx[k];
                    int nj = j + dy[k];
                    if(ni>=0&&ni<rows&&nj>=0&&nj<cols&&board[ni][nj]==1){
                        liveneighbours++;
                    }
                }
                if(board[i][j]==1){
                    if(liveneighbours<2||liveneighbours>3){
                        nextstate[i][j] =0;
                    } else{
                        nextstate[i][j] =1;
                    }
                } else{
                    if(liveneighbours==3){
                        nextstate[i][j] = 1;
                    }
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                board[i][j] = nextstate[i][j];
            }
        }
    }
    
}
