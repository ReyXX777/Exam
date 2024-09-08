import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Leetcode169 {
    public List<Boolean> candies(int [] candies,int extra){
        List<Boolean> ans = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int candy:candies)
        ans.add(candy+extra>=max);
        return ans;
    }
    public static void main(String [] args){
        Leetcode169 solution = new Leetcode169();
        int [] candies = {2,3,5,1,3};
        int extra = 3;
        System.out.println(solution.candies(candies, extra));
    }
}
