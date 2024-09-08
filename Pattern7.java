import java.util.Scanner;
public class Pattern7 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = in.nextInt();
        for (int i=0;i<rows;i++){
            for (int j=0;j<rows;j++){
                if(i==i || i==rows ||j==j||j==rows){
                    System.out.print(i);
                }else{
                    System.out.println(" ");
                    //j = j+1;
                }
                System.out.println();
                //i = i+1;
            }
        }
    }
    
}
