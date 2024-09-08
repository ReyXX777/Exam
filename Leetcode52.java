import java.util.Stack;
import java.util.Scanner;
public class Leetcode52 {
    public static String simplified(String path){
        Stack<String> stack = new Stack<>();
        String [] components = path.split("/");
        for(String directory:components){
            if(directory.equals(".")||directory.isEmpty()){
                continue;
            }else if(directory.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }else {
                    stack.push(directory);
                }
            }
        }
            StringBuilder result = new StringBuilder();
            for(String dir:stack){
result.append('/');
result.append(dir);
            }
            return result.length()>0?result.toString():"/";
        }
    
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the path");
        String path = in.nextLine();
        String simplifiespath = simplified(path);
        System.out.println("the result is" + simplifiespath);
    }
    
}
