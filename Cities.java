import java.util.HashMap;
public class Cities {
    public static void main(String[] args) {
        HashMap<String, String> oldCities = new HashMap<String , String>();
        oldCities.put("usa", "newyork");
        oldCities.put("united kingdom", "london");
oldCities.put("spain", "catalunya");        
for(String i: oldCities.keySet()){
    System.out.println(i +" " +  oldCities.get(i));
}
    }
}
