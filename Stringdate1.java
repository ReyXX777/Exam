import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Stringdate1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String date = in.nextLine();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd//mm//yy");
        try{
            Date date1 = dateformat.parse(date);
            System.out.println("the date is" + date1);

        }
        catch(ParseException e){
            System.out.println("wrong date format");
        }
        in.close();
    }
    
}
