class Listnode{
    int val;
    Listnode next;
    Listnode(int val) {this.val = val;}
    Listnode(int val,Listnode next){this.val = val;this.next = next;}
}
public class Leetcode154 {
    public Listnode reverse(Listnode head){
        if(head==null||head.next==null)
        return head;
        Listnode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

    }
    public static void main(String [] args){
        Leetcode154 solution = new Leetcode154();
        Listnode head = new Listnode(1,new Listnode(2,new Listnode(3,new Listnode(4,new Listnode(5)))));
        Listnode result = solution.reverse(head);
        while(result!=null){
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
    
}
