import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Leetcode182 {
    public boolean unique(int [] arr){
        Map<Integer,Integer> count = new HashMap<>();
        Set<Integer> occur = new HashSet<>();
        for(int a:arr)
        count.merge(a, 1, Integer::sum);
        for(int value:count.values())
        if(!occur.add(value))
        return false;
        return true;
    }
    public static void main(String [] args){
        Leetcode182 solution = new Leetcode182();
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(solution.unique(arr));
    }

    
}
