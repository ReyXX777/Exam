import java.util.Scanner;
public class Keith {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Long num = in.nextLong();
        if (isKeith(num)){
            System.out.println(num + "is aS keith number");
        }else {System.out.println(num + "is not a keith number");}
        in.close();
    }
    static boolean isKeith(long x){
        long originalnum= x;
        long n = 0; 
        long temp =x;
        while (temp>0){
            temp /= 10;
            n++;
        }
        long [] terms = new long[n];
        x = originalnum;
        for(int i = n-1;i>=0;i--){
            terms [x] = x%10;
            x /= 10;

        }
        int nextterm = 0;
        int i = n;
        while (nextterm < originalnum){
            nextterm = 0;
            for (int j=0;j<n;j++){
                nextterm += terms[i-j];

            }
            terms[i] = nextterm;
            i++;
        }
        return (nextterm==originalnum);

    }
    
}
