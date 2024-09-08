import java.util.Scanner;
public class Leetstreak1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int uglynumber = nthuglynumber(n);
        System.out.println("the ugly number is" + uglynumber);
    }
    public static int nthuglynumber(int n){
        int [] uglynumbers = new int[n];
        uglynumbers[0] = 1;
        int index2 =0;
        int index3 = 0;
        int index5 = 0;
        for(int i=1;i<n;i++){
            int nextuglynumbers = Math.min(uglynumbers[index2]*2,Math.min(uglynumbers[index3]*3,uglynumbers[index5] *5));
            uglynumbers[i] = nextuglynumbers;
            if(nextuglynumbers==uglynumbers[index2]*2) index2++;
            if(nextuglynumbers==uglynumbers[index3]*3) index3++;
            if(nextuglynumbers==uglynumbers[index5]*5) index5++;
        }
        return uglynumbers[n-1];
    }
    
}
