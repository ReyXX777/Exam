public class Leetcode157 {
    public boolean search(int [][] m,int t){
        int y = m.length,i=0,j=m[0].length-1;
        while(i<y&&j>=0){
            int cell = m[i][j];
            if(cell==t) return true;
            else if(cell>t) j--;
            else i++;
        }
        return false;
    }
    public static void main(String [] args){
        Leetcode157 solution = new Leetcode157();
        int [] [] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;
        System.out.println(solution.search(matrix, target));
    }
    
}
