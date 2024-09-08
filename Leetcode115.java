import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class Leetcode115 {
    private Queue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    private Queue<Integer> minheap = new PriorityQueue<>();
    public void addnum(int num){
        if(maxheap.isEmpty()||num<=maxheap.peek())
        maxheap.offer(num);
        else
        minheap.offer(num);
        if(maxheap.size()<minheap.size())
        maxheap.offer(minheap.poll());
        else if(maxheap.size()-minheap.size()>1)
        minheap.offer(maxheap.poll());
    }
    public double findmedian(){
        if(maxheap.size()==minheap.size())
        return (double)(maxheap.peek()+minheap.peek())/2.0;
        return (double)(maxheap.peek());
    }
    public static void main(String [] args){
        Leetcode115 solution = new Leetcode115();
        Scanner in = new Scanner(System.in);
        System.out.println("enter integers");
        while(in.hasNext()){
            String input = in.next();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            try{
                int num = Integer.parseInt(input);
                solution.addnum(num);
                System.out.println(solution.findmedian());

            }catch(NumberFormatException e){
                System.out.println("invalid exit");
            }
        }
    }
    
}
