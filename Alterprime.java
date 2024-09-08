import java.util.Scanner;
public class Alterprime {
    public static void main(String [ ] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int status =1;
        int n = 3;
        System.out.println("first" + num + " prime numbers are");
        System.out.print(2);
        for (int i =2;i<=num;){
            for (int j =2; j<=Math.sqrt(n);j++){
if (n%j==0){
    status = 0;
    break;
}
            }
            if (status!=0){
                System.out.println(n);
                i++;
            }
            status =1;
            n++;
        }
        System.out.println("alternate numbers are");
        for (int k =0;k<num;k++){
if (k%2==0){
    System.out.println((k));
}
        }
    }
    
}
