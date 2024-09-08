public class Leetcode173 {
    public int compress(char [] c){
        int ans = 0;
        for(int i=0;i<c.length;){
            char letter = c[i];
            int count = 0;
            while(i<c.length&&c[i]==letter){
                ++count;
                ++i;
            }
            c[ans++] = letter;
            if(count>1)
            for(char ch:String.valueOf(count).toCharArray())
            c[ans++] = ch;
        }
        return ans;
    }
    public static void main(String [] args){
        Leetcode173 solution = new Leetcode173();
        char [] c = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length = solution.compress(c);
        System.out.println(length);
        System.out.print("compressed array");
        for(int i=0;i<length;i++){
            System.out.print(c[i]);
        }
    }
    
}
