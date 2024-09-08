import java.util.Scanner;
public class Pattern5 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = in.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(rows-i);j++){
System.out.print("*");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        in.close();
    }
    
}
