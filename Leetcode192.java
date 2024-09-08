public class Leetcode192 {
    public int lucky(String s,int k){
        int ans = convert(s);
        for(int i=1;i<k;++i)
        ans = getsum(ans);
        return ans;
    }
    private int convert(String s){
        int sum = 0;
        for(char c:s.toCharArray()){
            int val = c - 'a' + 1;
            sum += val<10?val:(val%10+val/10);

        }
        return sum;
    }
    private int getsum(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String [] args){
        Leetcode192 solution = new Leetcode192();
        String s = "leetcode";
        int k = 2;
        int result = solution.lucky(s, k);
        System.out.println(result);
    }
    
}
