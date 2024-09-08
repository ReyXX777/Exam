import java.util.*;
public class Leetcode13 {
    private HashMap<Integer,Integer> valueMap;
    private ArrayList<Integer> valueList;
    private Random rand;
    public Leetcode13(){
        valueMap = new HashMap<>();
        valueList = new ArrayList<>();
        rand = new Random();


    }
    public boolean insert(int val){
        if(valueMap.containsKey(val)){
            return false;
        }
        valueMap.put(val,valueList.size());
        valueList.add(val);
        return true;
    }
    public boolean remove(int val){
        if(!valueMap.containsKey(val)){
            return false;
        }
        int index = valueMap.get(val);
        int lastelement = valueList.get(valueList.size()-1);
        valueList.set(index,lastelement);
        valueMap.put(lastelement,index);
        valueList.remove(valueList.size()-1);
        valueMap.remove(val);
        return true;
    }
    public int getrandom(){
        int random = rand.nextInt(valueList.size());
        return valueList.get(random);
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Leetcode13 randomize = new Leetcode13();
        while(true){
            System.out.println("enter an option");
            String option = in.nextLine();
            if(option.equals("exit")){
                break;
            }
            switch(option){
                case "insert":
                System.out.println("enter the value to insert");
                int insert = in.nextInt();
                System.out.println("insert result" + randomize.insert(insert));
                break;
                case "remove":
                System.out.println("enter the value to remove");
                int remove = in.nextInt();
                System.out.println("value removed" + randomize.remove(remove));
                break;
                case "random":
                System.out.println("random value" + randomize.getrandom());
                break;
                default:
                System.out.println("invalid operation");
            }
        }
    }
    
}
