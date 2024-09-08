import java.util.Scanner;
public class Leetcode16 {
    public static int candy(int[] ratings){
        int n = ratings.length;
        int [] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i] = 1;

        }
        for(int i=1;i<n;i++){
            if(ratings[i] >ratings[i-1]){
                candies[i] = candies[i-1] + 1;

            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i] = Math.max(candies[i],candies[i+1] + 1);
            }
        }
        int totalcandies = 0;
        for(int candy:candies){
            totalcandies += candy;
        }
        return totalcandies;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of childrens");
        int n = in.nextInt();
        int [] ratings = new int[n];
        System.out.println("enter the ratings");
        for(int i=0;i<n;i++){
            ratings[i] = in.nextInt();
        }
        int result = candy(ratings);
        System.out.println("minimum number of candies" + result);
    }
    
}
