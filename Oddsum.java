import java.util.Scanner;
public class Oddsum {
    public static void main(String [] args){
Scanner in = new Scanner(System.in);
System.out.println("enter the no of input allowed");
int n = in.nextInt();
int [] arr = new int [n];
System.out.println("enter the array elements");
for (int i=0;i<n;i++)
{
    arr[i] = in.nextInt();

}
int result = sumOfOddInteger(arr,n);
System.out.println("sum of the odd integer" + result);
in.close();
    }
    public static int sumOfOddInteger(int [] arr , int n){
        int sum=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2!=0){
sum += arr[i];


            }

            
        }
        return sum;
    }
    
}
