class Listnode{
    int val;
    Listnode next;
    Listnode (){}
    Listnode(int val) {this.val = val;}
    Listnode(int val,Listnode next) {this.val=val;this.next=next;}


}
public class Leetcode60 {
    public Listnode delete(Listnode head){
        if(head==null||head.next==null) return head;
        Listnode prev = new Listnode(-1,head);
        Listnode curr = head;
        Listnode dummy = prev;
        while(curr!=null&&curr.next!=null){
            if(curr.val==curr.next.val){
                while(curr!=null&&curr.next!=null&&curr.val==curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        // Example: [1, 2, 3, 3, 4, 4, 5]
        Listnode head = new Listnode(1);
        head.next = new Listnode(2);
        head.next.next = new Listnode(3);
        head.next.next.next = new Listnode(3);
        head.next.next.next.next = new Listnode(4);
        head.next.next.next.next.next = new Listnode(4);
        head.next.next.next.next.next.next = new Listnode(5);
        Leetcode60 solution = new Leetcode60();
        Listnode result = solution.delete(head);
        Listnode current = result;
        while(current!=null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    
}
