import java.util.Scanner;
public class Patterndiamond {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no of layers");
        int layers = in.nextInt();
        for (int i=layers;i>=1;i--){
for (int j=layers;j>i;j--){
    System.out.print(" ");
}
for (int j=i;j>=1;j--){
    System.out.print(j);
}
for (int j=2;j<=i;j++){
    System.out.print(j);
}
System.out.println();
        }
        for (int i=2;i<=layers;i++){
            for (int j=layers;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        in.close();
    }
    
}
