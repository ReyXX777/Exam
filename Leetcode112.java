import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode112 {
    public int kthlargest(int [] nums,int k){
        Queue<Integer> minheap = new PriorityQueue<>();
        for(int num:nums){
            minheap.offer(num);
            while(minheap.size()>k)
            minheap.poll();
        }
        return minheap.peek();
    }
    public static void main(String [] args){
        int [] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int k = 3;
        Leetcode112 solution = new Leetcode112();
        int kthlargest = solution.kthlargest(nums, k);
        System.out.println(kthlargest);
    }
}
