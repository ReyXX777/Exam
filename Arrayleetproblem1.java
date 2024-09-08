import java.util.Scanner;
public class Arrayleetproblem1 {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the num of elememts in nums a");
    int m = in.nextInt();
    System.out.println("enter the num of elements in num2");
    int n = in.nextInt();
    int [] nums1 = new int[m+n];
    int [] nums2 = new int[n];
    System.out.println("enter the sorted elements for nums 1");
    for(int i =0;i<m;i++){
        nums1[i] = in.nextInt();
    }
    System.out.println("enter the sorted elements for nums 2");
    for(int i=0;i<n;i++){
        nums2 [i] = in.nextInt();
    }
    merge(nums1,m,nums2,n);
    System.out.println("the new array");
    for(int i =0;i<m+n;i++){
        System.out.print(nums1[i] + " ");
    }
}
public static void merge(int[] nums1,int m ,int[] nums2,int n){
    int i = m-1;
    int j = n-1;
    int k = m + n -1;
    while(i>=0&&j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k--] = nums1[i--];
        }else{
            nums1[k--] = nums2[j--];
        }
    }
    while(j>=0){
        nums1[k--] = nums2[j--];
    }
}

    
}
