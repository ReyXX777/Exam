import java.util.Scanner;
public class Pattern2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = in.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=rows;j>=1;j--){
                if (i==j){
                    System.out.print("*");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
}
