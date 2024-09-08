import java.util.Stack;
import java.util.Scanner;
class Minstack{
    private Stack<Integer> minstack = new Stack<>();
    private Stack<Integer> stack = new Stack<>();
    public void push(int val){
        if(minstack.isEmpty()||val<=minstack.peek()){
            minstack.push(val);
        }
            stack.push(val);
        }
        public void pop(){
if(stack.peek().equals(minstack.peek())){
    minstack.pop();

}
stack.pop();
        }
        public int top(){
            return stack.peek();
        }
        public int getmin(){
            return minstack.peek();
        }
    }

public class Leetcode53 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Minstack minstack = new Minstack();
        while(true){
            System.out.println("enter operations");
            String operation = in.next();
            if(operation.equals("exit")){
                break;
            }else if(operation.equals("push")){
                System.out.println("enter the value to push");
                int value = in.nextInt();
                minstack.push(value);
            }else if(operation.equals("pop")){
                minstack.pop();
            }else if(operation.equals("top")){
                minstack.top();
            }else if(operation.equals("getmin")){
                minstack.getmin();
            }else{
                System.out.println("try again");
            }
        }
    }
    
}
