import java.util.Scanner;
public class Smith {
    static int findsumofdigits(int num){
        int sum = 0;
        while (num>0){
            sum += num %10;
            num /= 10;
        }
        return sum;
    }
    static int findsumoffactors(int num){
        int sum = 0;
        int i = 2;
        while(num>1){
            if (num%i==0){
sum += findsumofdigits(i);
num /= i;}
else {
    do{
        i++;
    }while (!isprime(i));
}

            }

return sum;
        }


  static boolean isprime(int n)  {
    for (int d=2; d*d <=n; d++){
        if (n%2==0){
            return false;
        }

    }
    return true;
  }
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number");
    int nos = in.nextInt();
    int digitsum = findsumofdigits(nos);
    int factorsum = findsumoffactors(nos);
    if (digitsum == factorsum){
        System.out.println("it is a smith number");
    }else {
        System.out.println("it is not a smith number");
    }

  }
}
