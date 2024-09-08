import java.util.Scanner;;
public class Autographic {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the numner ");
        int num = in.nextInt();
        int count = 0;
        
        int square = num*num;
        int temp = num;

        

        while (temp>0){
            count ++;
            temp/=10;}
            int lastdigit = (int) ( square % Math.pow(10 , count));
            if (num==lastdigit)
            System.out.println(num + "is an automorphic number");
            else 
            System.out.print(num + "is not an automorphic number");
            }

        }



    
    

