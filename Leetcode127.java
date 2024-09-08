import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode127 {
    public int mintotal(List<List<Integer>> triangle){
        for(int i=triangle.size()-2;i>=0;--i)
        for(int j=0;j<=i;++j)
        triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
        return triangle.get(0).get(0);


    }
    public static void main(String [] args){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        Leetcode127 solution = new Leetcode127();
        int minpathsum = solution.mintotal(triangle);
        System.out.println(minpathsum);
    }
    
}
