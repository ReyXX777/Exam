class Listnode{
    int val;
    Listnode next;
    Listnode(int val) {this.val = val;}
    Listnode(int val,Listnode next){this.val = val;this.next = next;}

}
public class Leetcode152 {
    public Listnode swap(Listnode head){
        int length = getLength(head);
        Listnode dummy = new Listnode(0,head);
        Listnode prev = dummy;
        Listnode curr = head;
        for(int i=0;i<length/2;++i){
            Listnode next = curr.next;
            curr.next = next.next;
            next.next = curr;
            prev.next = next;
            prev = curr;
            curr  =curr.next;

        }
        return dummy.next;



    }
    private int getLength(Listnode head){
        int length = 0;
        for(Listnode curr = head;curr!=null;curr=curr.next)
        ++length;
        return length;
    }
    public static void main(String [] args){
        Leetcode152 solution = new Leetcode152();
        Listnode head = new Listnode(1,new Listnode(2,new Listnode(3,new Listnode(4))));
        Listnode result = solution.swap(head);
        while(result!=null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
}
