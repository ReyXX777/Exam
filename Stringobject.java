import java.util.Scanner;
public class Stringobject {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        try {
            Class<?> classes = Class.forName(str);
            Object obj = classes.getDeclaredConstructor().newInstance();
            System.out.println("the object value is" + obj);
            System.out.println("the object datatype is " + obj.getClass().getName());
        }
        catch (Exception e){
            System.out.println("invalid class name" + e.getMessage());
        }
        /*Object obj = str;
        System.out.println("the object is" + obj);
        System.out.println("the data type of the object is" + obj.getClass().getName());*/
    }
    
}
