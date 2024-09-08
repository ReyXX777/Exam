import java.util.Scanner;
import java.util.Stack;
public class Leetcode51 {
    public static boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty()&& stack.peek()=='('){
                stack.pop();
            }else if(c==']' && !stack.isEmpty()&&stack.peek()=='['){
                stack.pop();
            }else if(c=='}' &&!stack.isEmpty()&&stack.peek()=='{'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String s = in.nextLine();
        boolean result = isvalid(s);
        System.out.println("the result is"+result);
    }
}
