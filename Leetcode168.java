public class Leetcode168 {
    public String gcd(String str1,String str2){
        if(str1.length()<str2.length())
        return gcd(str2, str1);
        if(!str1.startsWith(str2))
        return "";
        if(str2.isEmpty())
        return str1;
        return gcd(str2, mod(str1,str2));
    }
    public String mod(String s1,final String s2){
        while(s1.startsWith(s2))
        s1.substring(s2.length());
        return s1;
    }
    public static void main(String [] args){
        Leetcode168 solution = new Leetcode168();
        String str1 = "ABCABC";
        String str2 = "ABC";
        
        System.out.println(solution.gcd(str1, str2));
    }
    
}
