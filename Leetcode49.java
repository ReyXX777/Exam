import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leetcode49 {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the num of intervals");
    int n = in.nextInt();
    int [][] intervals = new int[n][2];
    System.out.println("enter the intervals");
    for(int i=0;i<n;i++){
        intervals[i][0] = in.nextInt();
        intervals[i][1] = in.nextInt();


    }
    System.out.println("enter the new interval");
    int []newinterval = {in.nextInt(),in.nextInt()};
    int [] [] result = insert(intervals,newinterval);
    System.out.println("after inserting the interval");
    for(int [] interval : result){
        System.out.print("[" + interval[0] + "," + interval[1] + "] ");
    }
}
public static int[][] insert(int[][] intervals,int[] newinterval){
    List<int [] >result = new ArrayList<>();
    for(int [] interval:intervals){
        if(newinterval==null||interval[1] <newinterval[0]){
            result.add(interval);
        }else if(interval[0]>newinterval[1]){
            result.add(newinterval);
            result.add(interval);
            newinterval =null;
        }else{
            newinterval[0] = Math.min(newinterval[0],interval[0]);
            newinterval[1] = Math.max(newinterval[1],interval[1]);
        }
    }
    if(newinterval!=null){
        result.add(newinterval);

    }
    return result.toArray(new int [result.size()] []);
}


    
}
