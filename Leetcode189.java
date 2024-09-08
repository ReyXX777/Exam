class Listnode{
    int val;
    Listnode next;
    Listnode(int val) {this.val = val;}
    Listnode(int val,Listnode next) {
        this.val =val;
        this.next = next;
    }
}
public class Leetcode189 {
    public Listnode delete(Listnode head){
        Listnode dummy = new Listnode(0,head);
        Listnode slow = dummy;
        Listnode fast = dummy;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String [] args){
        Leetcode189 solution = new Leetcode189();
        Listnode head = new Listnode(1,new Listnode(2,new Listnode(3,new Listnode(4))));
        Listnode result = solution.delete(head);
        while(result!=null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
}
