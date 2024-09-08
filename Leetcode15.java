import java.util.Scanner;
public class Leetcode15 {
    public static int complete(int [] gas,int [] cost){
        int totalgas =0;
        int totalcost =0;
        int start = 0;
        int tank  =0;
        for(int i=0;i<gas.length;i++){
            totalgas += gas[i];
            totalcost += cost[i];
            tank += gas[i] - cost[i];
            if(tank<0){
                start = i+1;
                tank = 0;
            }
        }
        return totalgas>=totalcost?start:-1;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of gas stations");
        int n = in.nextInt();
        int [] gas = new int [n];
        int [] cost = new int[n];
        System.out.println("enter amount of gas at each station");
        for(int i=0;i<n;i++){
            gas[i] = in.nextInt();
        }
        System.out.println("enter cost to each station");
        for(int i=0;i<n;i++){
            cost[i] = in.nextInt();
        }
        int result =complete(gas, cost);
        System.out.println("starting gas index" + result);
    }
}
