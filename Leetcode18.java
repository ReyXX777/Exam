import java.util.HashMap;
import java.util.Scanner;
public class Leetcode18{
    private static final HashMap<Character,Integer> romanvalues = new HashMap<>();
    static{
        romanvalues.put('I',1);
        romanvalues.put('V',5);
        romanvalues.put('X',10);
        romanvalues.put('L',50);
        romanvalues.put('C',100);
        romanvalues.put('D',500);
        romanvalues.put('M',1000);
    }
    public static int convert(String s){
        int sum = 0;
        int prev = 0;
        for(int i=s.length()-1;i>=0;i--){
            int value = romanvalues.get(s.charAt(i));
            if(value<prev){
                sum -= value;

            }else{
                sum += value;
            }
            prev = value;
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the roman numeral");
        String s = in.nextLine();
        System.out.println("the integer value" + convert(s));
        
    }
}