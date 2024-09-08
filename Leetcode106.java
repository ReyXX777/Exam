public class Leetcode106 {
    public boolean search(int[][] matrix,int target){
        if(matrix.length==0)
        return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int l =0;
        int r = m*n;
        while(l<r){
            int mid = (l+r)/2;
            int i = mid/n;
            int j = mid%n;
            if(matrix[i][j]==target)
            return true;
            if(matrix[i][j]<target)
            l = mid+1;
            else
            r = mid;

        }
        return false;

    }
    public static void main(String [] args){
        int [][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 15;
        Leetcode106 solution = new Leetcode106();
        boolean result = solution.search(matrix, target);
        System.out.println(result);

    }
    
}
