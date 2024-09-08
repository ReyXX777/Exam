import java.util.Scanner;
public class August {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        long number = in.nextLong();
        String words = numberToWords(number);
        System.out.println("number in words"+words);


    }
    public static String  numberToWords(long n){
        String [] multiplier = { "", "thousand", "million" , "million", "billion"};
        String [] firstTwenty = { "" , "one", "two", "three", "four", "five", "sex", "seven", "eight","nine","ten","eleven","twelve","thirteen","fourteen", "fifteen","sixteen","seventeen","eighteen","nineteen"};
        String [] tens = {"", "ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if (n==0){
            return "zero";


        }
        String answer = " ";
        long limit = 100000000L;
       int t=0;
       for (long i=n;i>0;i %= limit,limit/=1000){
        if (limit==0){
            break;
        }
        long currHun=i/limit;
        while (currHun==0){
            i %= limit;
            limit /= 1000;
            currHun = i/limit;
            ++t;

        }
        if (currHun>99){
            answer += firstTwenty[(int)(currHun/100)] + " hundred ";

            
        }
        currHun %= 100;
        if (currHun>0 && currHun<20){
            answer += firstTwenty[(int) currHun]+ "";

        }
        else if (currHun%10==0 && currHun!=0){
            answer += tens[(int)(currHun/10)-1]+"";


        }
        else if (currHun>20 && currHun<100){
            answer += tens[(int) (currHun/10)-1]+ " " + firstTwenty[(int) currHun%10]+ " ";
        }
if (t<4){
    answer += multiplier[++t] + "";

}
       }
       return answer.trim();

    }
}