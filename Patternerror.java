import java.util.Scanner;
public class Patternerror {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = in.nextInt();
        for (int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}
