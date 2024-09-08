import java.util.Scanner;
public class Leetcode33 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        char [][] board = new char[9][9];
        System.out.println("wnter the soduku board");
        for(int i=0;i<9;i++){
            String line = in.nextLine();
            for(int j=0;j<9;j++){
                board[i][j] = line.charAt(j);
            }
        }
        
        boolean isValid=(isValid(board));
        System.out.println("is the enter soduku valid" +isValid);
    }
    public static boolean isValid(char[][] board){
        for(int i=0;i<9;i++){
if(!ispartialValid(board[i])) return false;

        }
        for(int i=0;i<9;i++){
            char[] column = new char[9];
            for(int j=0;j<9;j++){
column[j] = board[j][i];
            }
            if(!ispartialValid(column)) return false;

        }
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    char[] box = new char[9];
                    for (int k = 0; k < 9; k++) {
                        box[k] = board[i + k / 3][j + k % 3];
                    }
                    if (!ispartialValid(box)) return false;
                }
            }
    
            return true;
        }
        private static boolean ispartialValid(char[] check) {
            boolean[] seen = new boolean[9];
            for (char c : check) {
                if (c != '.') {
                    int num = c - '1';
                    if (seen[num]) return false;
                    seen[num] = true;
                }
            }
            return true;
        }
    }
    

