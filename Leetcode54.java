import java.util.Stack;
import java.util.Scanner;
public class Leetcode54 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of tokens");
        int n = in.nextInt();
        in.nextLine();
        String [] tokens = new String[n];
        System.out.println("enter the tokens");
        for(int i=0;i<n;i++){
            tokens[i] = in.nextLine();
        }
        int result = eval(tokens);
        System.out.println("the result is"+result);
    }
    public static int eval(String [] tokens){
Stack<Integer> stack = new Stack<>();
for(String token:tokens){
    if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
        int second = stack.pop();
        int first = stack.pop();
        switch(token){
            case "+":
            stack.push(first+second);
            break;
            case "-":
            stack.push(first-second);
            break;
            case "*":
            stack.push(first*second);
            break;
            case "/":
            stack.push(first/second);
            break;
        }

    }else{
        stack.push(Integer.parseInt(token));
    }
}
return stack.pop();
    }
    
    
}
