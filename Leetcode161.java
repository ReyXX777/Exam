public class Leetcode161 {
    public String decode(String s){
        StringBuilder sb = new StringBuilder();
        while(i<s.length()&&s.charAt(i)!=']'){
            if(Character.isDigit(s.charAt(i))){
                int k =0;
                while(i<s.length()&&Character.isDigit(s.charAt(i)))
                k = k*10+(s.charAt(i++)-'0');
                ++i;
                String decodedString = decode(s);
                ++i;
                while(k-->0)
                sb.append(decodedString);

            }else{
                sb.append(s.charAt(i++));
            }
        }
        return sb.toString();
    }
    private int i =0;
    public static void main(String [] args){
        Leetcode161 solution = new Leetcode161();
        String s = "3[a]2[bc]";
        System.out.println(solution.decode(s));
    }
    
}
