import java.util.Arrays;
public class Leetcode203 {
    public int min(int [] piles,int h){
        int l=1;
        int r = Arrays.stream(piles).max().getAsInt();
        while(l<r){
            int m = (l+r)/2;
            if(eat(piles,m)<=h)
            r=m;
            else 
            l =m+1;
                
        }
        return l;
    }
    private int eat(int [] piles,int m){
        return Arrays.stream(piles).reduce(0, (subtotal,pile)->subtotal + (pile-1)/m+1);

    }
    public static void main(String [] args){
        Leetcode203 solution = new Leetcode203();
        int[] piles = {3, 6, 7, 11};
    int h = 8;
    int result = solution.min(piles, h);
    System.out.println(result);
    }
    
}
