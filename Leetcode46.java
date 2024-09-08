import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Leetcode46 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = in.nextInt();
        int [] nums = new int[n];
        System.out.println("enter the elements of the nums");
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        System.out.println("the answer of the problem " +longest(nums));
    }
    public static int longest(int [] nums){
        Set<Integer> numset = new HashSet<>();
        for(int num :nums){
            numset.add(num);
        }
        int longeststreak = 0;
        for(int num:numset){
            if(!numset.contains(num-1)){
                int currentnum = num;
                int currentstreak =1;
                while(numset.contains(currentnum+1)){
                    currentnum += 1;
                    currentstreak += 1;
                }
                longeststreak = Math.max(longeststreak,currentstreak);
            }
        }
        return longeststreak;
    }
    
}
