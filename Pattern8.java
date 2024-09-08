import java.util.Scanner;
public class Pattern8 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = in.nextInt();
        for(int i=0;i<=rows;i++){
            for(int j=i;j>=0;j--){
                for (int k =1;k<rows;k++){
                System.out.print(j);}
            }
            System.out.println(" ");
        }
    }
    
}
