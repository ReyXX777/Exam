public class Leetcode185 {
    public String remove(String s){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray())
        if(c=='a')
        sb.deleteCharAt(sb.length()-1);
        else
        sb.append(c);
        return sb.toString();
    }
    public static void main(String [] args){
        Leetcode185 solution = new Leetcode185();
        String s = "leet**cod*e";
        System.out.println(solution.remove(s));
    }
    
}
