public class Leetcode128 {
    public int minpathsum(int [][] grid){
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;++i)
        for(int j=0;j<n;++j)
        if(i>0&&j>0)
        grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
        else if(i>0)
        grid[i][0] += grid[i-1][0];
        else if(j>0)
        grid[0][j] += grid[0][j-1];
        return grid[m-1][n-1];
    }
    public static void main(String [] args){
        int [][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        Leetcode128 solution = new Leetcode128();
        int minpathsum1 = solution.minpathsum(grid);
        System.out.println(minpathsum1);
    }
    
}
