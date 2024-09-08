public class Leetcode201 {
    public int guess(int n){
        int l=1;
        int r = n;
        while(l<r){
            int m = l + (r-1)/2;
            if(guess(m)<=0)
            r=m;
            else
            l= m+1;
        }
        return 1;
    }
    public static void main(String [] args){
        Leetcode201 solution = new Leetcode201();
        int n=10;
        int result = solution.guess(n);
        System.out.println(result);
    }
    
}
