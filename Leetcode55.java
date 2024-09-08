import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

    class Listnode{
        int val;
        Listnode next;
        Listnode(int x){
            val = x;
            next = null;
        }
        public static Listnode deserialize(String data){
            if(data==null||data.isEmpty()){
                return null;
            }
            data = data.replaceAll("\\[|\\]","");
            String [] values = data.split(",");
            Listnode dummyhead = new Listnode(0);
            Listnode current = dummyhead;
            for(String value:values){
                current.next = new Listnode(Integer.parseInt(value.trim()));
                current = current.next;


            }
            return dummyhead.next;

        }
    }
    public class Leetcode55{
        public static boolean hascycle(Listnode head){
            HashSet<Listnode> nodeseen = new HashSet<>();
            while(head!=null){
                if(nodeseen.contains(head)){
                    return true;
                }else{
                    nodeseen.add(head);
                }
                head = head.next;
            }
            return false;
        }
        public static void main(String [] args){
Scanner in = new Scanner(System.in);
System.out.println("enter the list");
String input = in.nextLine();
Listnode head = Listnode.deserialize(input);
System.out.println("enter the position");
int pos = in.nextInt();
if(pos!=-1){
    Listnode tail = head;
    Listnode cyclenode = head;
    for(int i =0;i<pos;i++){
        cyclenode = cyclenode.next;

    }
    while(tail.next!=null){
        tail = tail.next;
    }
    tail.next = cyclenode;
}
Leetcode55 solution = new Leetcode55();
boolean result = solution.hascycle(head);
System.out.println("cycle detected" + result);
        }
    }

    

