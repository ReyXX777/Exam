import java.util.Scanner;
public class Factorial{  
    public static void main(String args[]){  
     Scanner in = new Scanner(System.in);
     System.out.print(" enter the number to calculate");
     int n = in.nextInt();
  
 

        int i,fact=1;  
       
     for(i=1;i<=n;i++){    
         fact=fact*i;    
     }    
     System.out.println("Factorial of "+n+" is: "+fact);    
    }  
     {
    
}
}