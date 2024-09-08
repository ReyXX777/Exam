public class Leetcode184 {
    public int equal(int [][] grid){
        int n = grid.length;
        int ans = 0;
        for(int i=0;i<n;++i)
        for(int j=0;j<n;++j){
        int k=0;
        for(;k<n;++k)
        if(grid[i][k] != grid[k][j])
        break;
        if(k==n) 
        ++ans;
        }
        return ans;


    }
    public static void main(String [] args){
        Leetcode184 solution = new Leetcode184();
        int[][] grid = {
            {3, 2, 1},
      {1, 7, 6},
      {2, 7, 7}
        };
        System.out.println(solution.equal(grid));
    }
    
}
