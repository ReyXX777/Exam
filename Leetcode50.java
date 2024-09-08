import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode50 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of balloons");
        int n = in.nextInt();
        int [][] points = new int[n][2];
        System.out.println("enter the dimension of the baloons");
        for(int i=0;i<n;i++){
            points[i][0] = in.nextInt();
            points[i][1] = in.nextInt();
        }
        int result = minarrows(points);
        System.out.println("minimum arrows" +result);

        }
        public static int minarrows(int[][] points){
            if(points.length==0){
                return 0;
            }
            Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
            int arrows = 1;
            int arrowspos = points[0][1];
            for(int i=0;i<points.length;i++){
                if(points[i][0]>arrowspos){
                    arrows++;
                    arrowspos = points[i][1];
                }
            }
            return arrows;
        }
    }
    

