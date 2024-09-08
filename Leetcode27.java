import java.util.Scanner;
public class Leetcode27 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter num of elements in the array");
        int n = in.nextInt();
        int [] numbers = new int[n];
        System.out.println("enter n elements in decreasing order");
        for(int i=0;i<n;i++){
            numbers[i] = in.nextInt();
        }
        System.out.println("enter the target sum");
        int target = in.nextInt();
        int [] result = find(numbers,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
    public static int[] find(int[] numbers,int target){
        int leftindex =0;
        int rightindex = numbers.length-1;
        while(leftindex<rightindex){
            int sum = numbers[leftindex] + numbers[rightindex];
            if(sum==target){
                return new int[]{leftindex+1,rightindex+1};
            }else if(sum<target){
                leftindex++;
            }else{
                rightindex--;
            }
        }
        return null;
    }
    
}
