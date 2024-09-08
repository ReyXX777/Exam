import java.util.*;
public class Leetcode199 {
    public int nearest(char[][] maze,int [] entrance){
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = maze.length;
        int n = maze[0].length;
        int ans = 0;
        Queue<int [] > q = new ArrayDeque<>(Arrays.asList(new int [] {entrance[0],entrance[1]}));
        boolean [][] seen = new boolean[m][n];
        seen[entrance[0]][entrance[1]] = true;
        while(!q.isEmpty()){
            ++ans;
            for(int sz=q.size();sz>0;--sz){
                int i = q.peek()[0];
                int j = q.poll()[1];
                for(int [] dir:dirs){
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(x<0||x==m||y<0||y==n)
                    continue;
                    if(seen[x][y] || maze[x][y] =='x')
                    continue;
                    if(x==0||x==m-1||y==0||y==n-1)
                    return ans;
                    q.offer(new int[] {x,y});
                    seen[x][y] = true;

                }
            }
        }
        return -1;


    }
    public static void main(String [] args){
        Leetcode199 solution = new Leetcode199();
        char[][] maze = { 
            {'+', '+', '.', '+'},
            {'.', '.', '.', '+'},
            {'+', '+', '+', '.'}
        };
        int [] entrance = {1,2};
        int result = solution.nearest(maze, entrance);
        System.out.println(result);
    }
    
}
