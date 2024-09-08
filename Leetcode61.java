public class Leetcode61 {
    public Listnode rotate(Listnode head,int k){
        if(head==null||head.next==null||k==0){
            return head;
        }
        Listnode current = head;
        int length = 1;
        while(current.next!=null){
            current = current.next;
            length += 1;
        }
        current.next =head;
        k = k%length;
        int newsteps = length-k;
        Listnode newtail = head;
        for(int i=1;i<newsteps;i++){
            newtail = newtail.next;
        }
        Listnode newhead = newtail.next;
        newtail.next = null;
        return newhead;

    }
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Listnode head = new Listnode(1);
        head.next = new Listnode(2);
        head.next.next = new Listnode(3);
        head.next.next.next = new Listnode(4);
        head.next.next.next.next = new Listnode(5);
        int k =2;
        Leetcode61 solution = new Leetcode61();
        Listnode newhead = solution.rotate(head, k);
        System.out.println("rotated list");
        while(newhead!=null){
            System.out.print(newhead.val + " ");
            newhead = newhead.next;
        }
    }
}
