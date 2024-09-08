import java.util.Scanner;
public class Leetcode17 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements");
        int n = in.nextInt();
        int [] height  = new int[n];
        System.out.println("enter the values of the elements");
        for(int i=0;i<n;i++){
            height[i] = in.nextInt();
        }
        System.out.println("trapped water" + trap(height));
    }
    public static int trap(int [] height){
        if(height == null || height.length<=2) return 0;
        int leftmax = 0;
        int rightmax =0;
        int rightindex = height.length-1;
        int leftindex = 0;
        int trappedwater = 0;
        while(leftindex<rightindex){
            if(height[leftindex] < height[rightindex]){
            if(height[leftindex]>leftmax){
                leftmax = height[leftindex];

            }else{
                trappedwater += leftmax - height[leftindex];
            }
            leftindex++;
        }else {
            if(height[rightindex] > rightmax){
                rightmax = height[rightindex];

            }else{
                trappedwater += rightmax - height[rightindex];
            }
            rightindex--;
        }
    }
        return trappedwater;

    }
}

    
    

