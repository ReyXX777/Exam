import java.util.Scanner;
public class Roushan {
    public static void main (String [] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the string");
        String roushan = inp.nextLine();

        for (int i=0;i<roushan.length();i++) {

        char c  = Character.toLowerCase(roushan.charAt(i));
        {
            if (c =='a' || c== 'e' || c == 'i' || c == 'o' ||  c == 'u' ){

        

            System.out.println( i + 1 );
        }

    }

}
}

}