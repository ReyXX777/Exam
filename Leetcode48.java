import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Leetcode48 {
    public static int [][] merge(int [][] interval){
        if(interval.length<1){
            return interval;
        }
        Arrays.sort(interval,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        int [] currentinterval = interval[0];
        merged.add(currentinterval);
        for (int[] intervals : interval){
            int currentend = currentinterval[1];
            int nextbegin = intervals[0];
            int nextend = intervals[1];
            if(currentend>=nextbegin){
                currentinterval[1] = Math.max(currentend,nextend);


            }else{
                currentinterval = intervals;
                merged.add(currentinterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);

    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of intervals");
        int n = in.nextInt();
        int [][] interval = new int[n][2];
        System.out.println("enter the intervals");
        for(int i=0;i<n;i++){
            interval[i][0] = in.nextInt();
            interval[i][1] = in.nextInt();
        }
        int [][] mergedintervals = merge(interval);
        System.out.println("merged intervals");
        for(int[] intervals:mergedintervals){
System.out.println("[" + intervals[0] + ", " + intervals[1] + "]");
        }
    }

    
}
