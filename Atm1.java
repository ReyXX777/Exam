import java.util.Scanner;
public class Atm1 {
    public static void main (String [] args){
        int balance = 10000;
        int withdraw;
        int deposit;
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("choose 1 to withdraw money");
            System.out.println("choose 2 to deposit money");
            System.out.println("choose 3 to view balance");
            System.out.println("exit");

        
        int choice = in.nextInt();
        switch (choice){
            case 1 :
            System.out.println("enter the amount to withdraw");
            withdraw = in.nextInt();
            if (balance>=withdraw){
                balance -= withdraw;
                System.out.println("withdraw your money");
            }else{
                System.out.println("insuffient funds");
                
            } 
            break;
            case 2:
            System.out.println("enter the amount to deposit");
            deposit = in.nextInt();
            balance += deposit;
            System.out.println("your money is deposited");
            break;
            case 3:
            System.out.println("balance = " + balance);
            break;
            case 4:
            System.exit(0);
            default :
            System.out.println("invalid choice");
        }
        

    }
    
    }
}
