import java.util.Scanner;
public class Patternpyramid {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the lines");
        int lines = in.nextInt();
        for (int i =1;i<lines;i++){
            for (int j=1;j<=lines/2;j++){
                if (i==j|| (i>4 && j==lines-i)){
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
            }
            for (int j=lines/2-1;j>0;j--){
                if (i==j || (i>4&&j==lines-i)){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        in.close();
    }
}