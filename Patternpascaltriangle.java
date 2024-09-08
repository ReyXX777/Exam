import java.util.Scanner;
public class Patternpascaltriangle {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = in.nextInt();
        int coe;
        for (int i=0;i<rows;i++){
            for (int j=0;j<rows-i;++j){
                System.out.print(" ");
            }
            coe =1;
            for (int k=0;k<=i;k++){
                if (k>0&& i>0){
                    coe = coe*(i-k+1)/k;
                }
                System.out.printf("%4d",coe);
            }
            System.out.println();
        }
    }
    
}
