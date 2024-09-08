import java.util.ArrayList;
import java.util.Collections;

public class Leetcode110 {
    public double median(int [] nums1,int[] nums2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int size = list.size();
        if(size%2==1)
        return (double)list.get(size/2);
        return (double) (list.get((size/2)-1) + list.get(size/2))/2;


    }
    public static void main(String [] args){
        int [] nums1 = {1,3};
        int [] nums2 = {2,4};
        Leetcode110 solution = new Leetcode110();
        double median = solution.median(nums1, nums2);
        System.out.println(median);
    }
    
}
