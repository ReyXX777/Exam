import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Leetcode181 {
    public List<List<Integer>> find(int [] nums1,int [] nums2){
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet()); 
        Arrays.stream(nums1).forEach(set2::remove);
        Arrays.stream(nums2).forEach(set1::remove);
        return Arrays.asList(new ArrayList<>(set1),new ArrayList<>(set2));
    }
    public static void main(String [] args){
        Leetcode181 solution = new Leetcode181();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(solution.find(nums1,nums2));
    }
    
}
