public class Leetcode105 {
    public int search(int [] nums,int target){
        int l=0;
        int r=nums.length;
        while(l<r){
            final int m =(l+r)/2;
            if(nums[m]==target)
                return m;
                if(nums[m]<target)
                l=m+1;
                else
                r=m;
                    
                }
                return l;
            }
            public static void main(String [] args){
                int [] nums ={1, 3, 5, 6};
                int target =5;
                Leetcode105 solution = new Leetcode105();
                int result = solution.search(nums, target);
                System.out.println(result);
            }
        }
    
    

