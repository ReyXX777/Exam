class Listnode{
    Listnode next;
    int val;
    Listnode(int val){this.val=val;}
    Listnode(int val,Listnode next){this.val=val;this.next=next;}
}
public class Leetcode153 {
    public Listnode detect(Listnode head){
        Listnode slow = head;
        Listnode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String [] args){
        Leetcode153 solution = new Leetcode153();
        Listnode head = new Listnode(3);
        head.next = new Listnode(2);
        head.next.next = new Listnode(0);
        head.next.next.next = new Listnode(-4);
        head.next.next.next.next = head.next;
        Listnode cyclenode = solution.detect(head);
        if(cyclenode!=null){
            System.out.println(cyclenode.val);
        }else{
            System.out.println("no cycle detected");
        }
    }
    
}
