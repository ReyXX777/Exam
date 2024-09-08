import java.util.Scanner;
public class Patternpyramid1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = in.nextInt();
        for (int i=rows;i>0;i--){
            for (int j=0;j<(rows -i);j++){
                System.out.print(" ");}
                for (int k =0;k<(2*i-1);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            in.close();
        }
    }
    

