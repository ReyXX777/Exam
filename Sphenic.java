import java.util.Scanner;
import java.util.Arrays;
public class Sphenic {

    static boolean arr[] = new boolean[10000];
    static void findprime(){
        Arrays.fill(arr,true);
        for (int p=2;p*p<10000;p++){
            if (arr[p]){
                for (int i =p*p;i<10000;i += p){
                    arr[i] = false;
                }

            }
        }
    }
    static boolean haseightdivisor(int num){
int count = 0;
for (int i =1;i<=num;i++){
if (num%i==0){
    count++;
}
}
return count==8;

    }
    static boolean firstthreedigitsprime(int num){
        int temp = num;
        int count =0;
        while (temp>0){
            int digit = temp%10;
            if (digit!=1 && arr[digit]){
                count ++;

            }
            temp /= 10;
        }
        return count == 3;

    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to check");
        int number = in.nextInt();
        if (haseightdivisor(number) && firstthreedigitsprime(number)){
            System.out.println("it is a sphenic number");
        } else {
            System.out.println("it is not a sphenic number");
        }
    }
}

