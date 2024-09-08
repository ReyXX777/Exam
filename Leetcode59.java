
public class Leetcode59 {
    public Listnode remove(Listnode head,int n){
        Listnode fpointer = head;
        Listnode spointer = head;
        while(n-->0) fpointer = fpointer.next;
        if(fpointer == null){
            Listnode nodetoremove = head;
            head = head.next;
            nodetoremove = null;
            return head;
        }
        while(fpointer.next!=null){
            spointer = spointer.next;
            fpointer = fpointer.next;

        }
        Listnode nodetoremove = spointer.next;
        spointer.next = nodetoremove.next;
        nodetoremove =null;
        return head;
    }
    public static void main(String[] args) {
        // Example: [1, 2, 3, 4, 5], n = 2
        Listnode head = new Listnode(1);
        head.next = new Listnode(2);
        head.next.next = new Listnode(3);
        head.next.next.next = new Listnode(4);
        head.next.next.next.next = new Listnode(5);
        Leetcode59 solution = new Leetcode59();
        Listnode result = solution.remove(head, 2);
        Listnode current = result;
        while(current!=null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    
}
