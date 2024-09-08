import java.util.*;
public class Leetcode148 {
    public int rotting(int [][] grid){
        int rows = grid.length,cols = grid[0].length;
        int fresh = 0;
        Deque<int []> queue = new LinkedList<>();
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                if(grid[i][j]==2){
                    queue.offer(new int[] {i,j});

                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int minutes = 0;
        int [] direcions = {1,0,-1,0,1};
        while(!queue.isEmpty() && fresh>0){
            minutes++;
            for(int i=queue.size();i>0;--i){
                int [] position = queue.poll();
                for(int j=0;j<4;j++){
                    int x =position[0] + direcions[j];
                    int y = position[1] + direcions[j+1];
                    if(x>=0&&x<rows&&y>=0&&y<cols&&grid[x][y]==1){
                        grid[x][y] =2;
                        fresh--;
                        queue.offer(new int[] {x,y});
                    }
                }
            }
        }
        return fresh>0?-1:minutes;

    }
    public static void main(String [] args){
        Leetcode148 solution = new Leetcode148();
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        System.out.println(solution.rotting(grid));
    }
    
}
