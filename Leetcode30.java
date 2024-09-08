import java.util.Scanner;
public class Leetcode30 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the target of elements");
        int target = in.nextInt();
        System.out.println("enter the number of elements");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();

        }
        int answer = find(arr,target);
        System.out.println("the minimum length" +target +answer);
    }
    public static int find(int[]arr,int target){
        int n=arr.length;
        if(n==0) {
            return 0;

    }
    int ans = Integer.MAX_VALUE;
    int left =0;
    int sum=0;
    for(int i=0;i<n;i++){
        sum += arr[i];
        while(sum>=target){
            ans = Math.min(ans,i+1-left);
            sum -= arr[left++];
        }
    }
    return (ans!=Integer.MAX_VALUE)?ans:0;
    
}
}
