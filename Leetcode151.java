import java.util.*;
class T{
    public int num;
   public  int freq;
   public T(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}
public class Leetcode151 {
    public int [] frequent(int [] nums,int k){
        int n = nums.length;
        int [] ans = new int[k];
        Map<Integer,Integer> count  = new HashMap<>();
        Queue<T> min = new PriorityQueue<>((a,b)->Integer.compare(a.freq, b.freq));
        for(int num:nums)
        count.merge(num, 1, Integer::sum);
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            min.offer(new T(num, freq));
            if(min.size()>k)
            min.poll();

        }
        for(int i=0;i<k;++i)
        ans[i] = min.poll().num;
        return ans;
    }
    public static void main(String [] args){
        Leetcode151 solution = new Leetcode151();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(solution.frequent(nums, k)));
    }
    
}
