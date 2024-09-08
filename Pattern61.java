import java.util.Scanner;
public class Pattern61{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = in.nextInt();
        for(int i=0;i<rows;i++){
            System.out.print(i);
        
        for (int j=0;j<=9;j++){
            if (j<=i){
System.out.print(j);
            }
        }
        for (int k=8;k>=0;k--){
if (k<=i){
    System.out.print(k);
}
        }
        System.out.println(i);
    }
    in.close();
    }
}