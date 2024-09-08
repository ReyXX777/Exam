import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Stringtodate {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String date = in.nextLine();
        try {
            SimpleDateFormat date1 = new SimpleDateFormat("dd/mm/yy");
            Date date2 = date1.parse(date);
            String datestring = date1.format(date2);
            System.out.println("the date string is" + datestring);
        }
        catch (Exception e){
            System.out.println("invalid format");

        }
        in.close();
    }
    
}
