public class Leetcode104 {
    public int maxsubarray(int [] nums){
        int totalsum=0;
        int currentmin = 0;
        int currentmax = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int num:nums){
            totalsum += num;
            currentmax = Math.max(currentmax+num,num);
            currentmin = Math.min(currentmin+num,num);
            maxsum = Math.max(currentmax,maxsum);
            minsum = Math.max(currentmin,minsum);

        }
        return maxsum<0?maxsum:Math.max(maxsum,totalsum-minsum);

    }
    public static void main(String [] args){
        int [] nums =  {1, -2, 3, -2, 5}; 
        Leetcode104 solution = new Leetcode104();
        int result = solution.maxsubarray(nums);
        System.out.println(result);
    }
    
    
}
