import java.util.Scanner;
public class Evil {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int number = in.nextInt();
        if (number <0){
            System.out.print("invalid integer");
        return;}
    
    int countones =0;
    int binaryequivalent=0;
    int position= 0;
    while (number>0){
        int digit = number%2;
        if (digit==1){
            countones++;
        }
        binaryequivalent += digit * Math.pow(10, position);
        position++;
        number /= 2;


    }
    System.out.println("binary equivalent"+binaryequivalent);
    System.out.println("number of ones"+countones);
}
}