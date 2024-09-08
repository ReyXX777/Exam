import java.util.Queue;
import java.util.LinkedList;

public class Leetcode83 {
    public int numisland(char[][] grid){
        int result = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    result++;
                    bfs(grid,i,j);
                }
            }
        }
        return result;
    }
    void bfs(char[][] grid,int i,int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        grid[i][j]=0;
        int [][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] coords = queue.poll();
            int curri = coords[0];
            int currj = coords[1];
            for(int [] directions:direction){
                int newi = curri + directions[0];
                int newj = currj + directions[1];
                if(newi>=0&&newi<grid.length&&newj>=0&&newj<grid[0].length&&grid[newi][newj]=='1'){
                    queue.add(new int[]{newi,newj});
                    grid[newi][newj]=0;
                }
            }
        }
    }
    public static void main(String [] args){
        Leetcode83 solution = new Leetcode83();
        char [][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int result = solution.numisland(grid);
        System.out.println("the number of island is"+result);

    }
    
}
