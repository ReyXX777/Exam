import java.util.Scanner;
public class Technumber {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
System.out.println("enter the number");
int num = in.nextInt();
int digit = 0;
int temp = num;
while(temp>0){
    digit++;
    temp/=10;


}
if (digit %2==0){
    int firsthalf = num %(int) Math.pow(10,digit/2);
    int secondhalf = num/ (int) Math.pow(10,digit/2);
    int sum = firsthalf + secondhalf;
    int squareOfsum = sum*sum;
    if (num == squareOfsum){
        System.out.print(+num +"is a tech number");
    }else {
        System.out.print(+num + "is not a tech number");
    }
    }


}
    }

    

