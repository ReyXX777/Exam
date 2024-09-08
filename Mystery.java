import java.util.Scanner;
public class Mystery {
    static boolean ismystery(int num){
        for (int i=1;i<=num/2;i++){
            int j = reversednumber(i);
            if (i+j==num){
                System.out.println(i + "  " + j);
                return true;
            }
        }
        return false;
    }
    static int reversednumber(int n){
        
        String str = Integer.toString(n);
        StringBuilder reversed = new StringBuilder(str).reverse();
        return Integer.parseInt(reversed.toString());
    }
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int nos = in.nextInt();
        if (ismystery(nos)){
            System.out.println("it is a mystery number");
        }else{
            System.out.println("it is not a mystery number");
        }

    }
}
