import java.util.*;
import java.util.List;
class T{
    public int i;
    public int j;
    public int sum;
    public T(int i,int j,int sum){
        this.i = i;
        this.j = j;
        this.sum = sum;
    }
}
public class Leetcode114 {
    public List<List<Integer>> smallestpair(int [] nums1,int [] nums2, int k){
        List<List<Integer>>ans = new ArrayList<>();
        Queue<T> minheap = new PriorityQueue<>((a,b)->Integer.compare(a.sum, b.sum));
        for(int i=0;i<Math.min(k,nums1.length);++i) 
        minheap.offer(new T(i,0, nums1[i]+nums2[0]));
        while(!minheap.isEmpty()&&ans.size()<k){
            int i = minheap.peek().i;
            int j=minheap.peek().j;
            ans.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1<nums2.length)
            minheap.offer(new T(i,j+1,nums1[i]+nums2[j+1]));

        }
        return ans;


    }
    public static void main(String [] args){
        int [] nums1 = {1,7,11};
        int [] nums2 = {2,4,6};
        int k=3;
        Leetcode114 solution = new Leetcode114();
        List<List<Integer>> result = solution.smallestpair(nums1,nums2,k);
        System.out.println(result);
    }
}
