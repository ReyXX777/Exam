import java.util.Arrays;
public class Leetcode202 {
    public int [] pairs(int [] spells, int [] potions,long success){
        int [] ans = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;++i)
        ans[i] =potions.length - first(spells[i],potions,success);
        return ans;
    }
    private int first(int spell, int [] potions,long success){
        int l=0;
        int r = potions.length;
        while(l<r){
            int m = (l+r)/2;
            if((long) spell*potions[m]>=success)
            r=m;
            else 
            l = m+1;

        }
        return l;
    }
    public static void main(String [] args){
        Leetcode202 solution = new Leetcode202();
        int[] spells = {10, 20, 30};
    int[] potions = {1, 2, 3, 4, 5};
    long success = 50;
    int [] result = solution.pairs(spells, potions, success);
    System.out.println(Arrays.toString(result));

    }
    
}
