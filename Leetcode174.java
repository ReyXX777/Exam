import java.util.HashMap;
public class Leetcode174 {
    public int max(int [] nums,int k){
        int ans = 0;
        HashMap <Integer,Integer> count = new HashMap<>();
        for(int num:nums)
        count.merge(num, 1,Integer::sum);
        for(int num:count.keySet()){
            int complement = k-num;
            if(count.containsKey(complement))
            ans += Math.min(count.get(num),count.get(complement)); 
        }
        return ans/2;
    }
    public static void main(String [] args){
        Leetcode174 solution = new Leetcode174();
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        System.out.println(solution.max(nums, k));
    }

    
}
