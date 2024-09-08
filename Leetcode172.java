public class Leetcode172 {
    public boolean triplet(int [] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num:nums)
        if(num<=first)
        first = num;
        else if(num<=second)
        second = num;
        else 
        return true;
        return false;
    }
    public static void main(String [] args){
        Leetcode172 solution = new Leetcode172();
        int [] nums = {1, 2, 3, 4, 5};
        System.out.println(solution.triplet(nums));
    }
    
}
