import java.util.HashMap;
import java.util.Map;

public class Leetcode121 {
    public int maxpoint(int [][] points){
        int numpoints = points.length;
        int maxpoint = 1;
        for(int i=0;i<numpoints;++i){
            int x1 = points[i][0],y1 = points[i][1];
            Map<String,Integer> linemap = new HashMap<>();
            for(int j=i+1;j<numpoints;++j){
                int x2 = points[j][0],y2 = points[j][1];
                int deltax = x2-x1;
                int deltay = y2-y1;
                int gcd = gcd(deltax,deltay);
                String slopekey = (deltax/gcd) + " ." + (deltay/gcd);
                linemap.put(slopekey,linemap.getOrDefault(slopekey,0)+1);
                maxpoint = Math.max(maxpoint,linemap.get(slopekey)+1);

            }
        }
        return maxpoint;
    } 
    private int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String [] args){
        int [][] points = {
            {1,1},
            {2,2},
            {3,3}
        };
        Leetcode121 solution = new Leetcode121();
        int result = solution.maxpoint(points);
        System.out.println(result);
    }
    
}
