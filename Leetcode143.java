import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Leetcode143 {
    public List<List<Integer>> generate(int numrows){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numrows;++i){
            Integer [] temp = new Integer[i+1];
            Arrays.fill(temp, 1);
            ans.add(Arrays.asList(temp));
        }
        for(int i=2;i<numrows;++i)
        for(int j=1;j<ans.get(i).size()-1;++j)
        ans.get(i).set(j,ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
        return ans;
    }
    public static void main(String [] args){
        Leetcode143 solution = new Leetcode143();
        int numrows = 5;
        List<List<Integer>> result = solution.generate(numrows);
        System.out.println(numrows);
        for(List<Integer>row:result){
            System.out.println(row);
        }
    }
    
}
