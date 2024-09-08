import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode113 {
    public int findcapital(int k,int w,int [] profits,int [] capital){
        record T(int pro,int cap){}
        Queue<T> minheap = new PriorityQueue<>((a,b)->Integer.compare(a.cap,b.cap));
        Queue<T> maxheap = new PriorityQueue<>((a,b)->Integer.compare(b.pro, a.pro));
        for(int i=0;i<capital.length;++i)
            minheap.offer(new T(profits[i],capital[i]));
            while(k-->0){
                while(!minheap.isEmpty()&&minheap.peek().cap<=w)
                maxheap.offer(minheap.poll());
                if(maxheap.isEmpty())
                break;
                w += maxheap.poll().pro;
            }
            return w;


        }
        public static void main(String [] args){
            int [] profits = { 1,2,3};
            int [] capital = {0,1,1};
            int initialcapital = 1;
            int k = 2;
            Leetcode113 solution = new Leetcode113();
            int finalcapital = solution.findcapital(k, initialcapital, profits, capital);
            System.out.println("Final capital: " + finalcapital);

        }



    }
    

