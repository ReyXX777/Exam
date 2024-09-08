import java.util.Scanner;
public class Pattern3 {
    public static void main(String [ ] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = in.nextInt();
        for(int i =0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if (i==j || i+j==rows-1){
                    System.out.print("*");
                }else {
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }
    
}
