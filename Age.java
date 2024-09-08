import java.util.Arrays;
public class Age {
    public static void main(String[] args) {
        int ages[] = {10,20,30,40,50};
        int length = ages.length;
        int lowestage=ages [0];
        for(int age : ages ){
            if (lowestage > age ){
                lowestage = age;
            } 
        }
        System.out.println(lowestage);
    }
    
}
