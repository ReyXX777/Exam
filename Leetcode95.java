import java.util.*;
import java.util.List;
public class Leetcode95 {
    public void swap(int [] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j]=t;

    }
    public void allpermutation(int [] nums,List<List<Integer>> ans,int index){
        if(index>=nums.length){
            List<Integer> a = new ArrayList<>();
            for(int e:nums){
                a.add(e);

            }
            ans.add(a);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            allpermutation(nums,ans,index+1);
            swap(nums,index,i);
        }
    }
    public List<List<Integer>> allpermute(int [] nums){
        List<List<Integer>> ans = new ArrayList<>();
        allpermutation(nums,ans,0);
        return ans;
    }
    public static void main(String [] args){
        Leetcode95 solution = new Leetcode95();
        int [] nums ={1,2,3};
        List<List<Integer>> result = solution.allpermute(nums);
        System.out.println(result);
    }
    
}
