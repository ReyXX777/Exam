import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
public class Stringtotimestamp {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date date = dateformat.parse(str);
            Timestamp timestamp = new Timestamp(date.getTime());
            System.out.println("the timestamp is" + timestamp);
        }
        catch (ParseException e){
            System.out.println("invalid input");
        }
        in.close();
    }
    
}
