class Listnode{
    int val;
    Listnode next;
    Listnode (){}
    Listnode(int val) {this.val = val;}
    Listnode(int val,Listnode next) {this.val = val;this.next = next;}

}
public class Leetcode58 {
    public int getlength(Listnode head){
        Listnode currentnode = head;
        int length =0;
        while(currentnode!=null){
            currentnode = currentnode.next;
            length++;
        }
        return length;
    }
    private Listnode temphead = null;
    private Listnode temptail = null;
    public void addfirstnode(Listnode node){
        if(temphead==null){
            temphead = node;
            temptail = node;

        } else{
            node.next = temphead;
            temphead = node;
        }

    }
    public Listnode reverse(Listnode head,int k){
        if(head==null||head.next==null||k==0) return head;
        Listnode overallhead = null;
        Listnode overalltail = null;
        Listnode currentnode = head;
        int length = getlength(currentnode);
        while(length>=k){
            int tempk = k;
            while(tempk-- > 0){
                Listnode forwardnode = currentnode.next;
                currentnode.next =null;
                addfirstnode(currentnode);
                currentnode = forwardnode;

            }
            if(overallhead==null){
                overallhead = temphead;
                overalltail = temptail;
            }else{
                overalltail.next = temphead;
                overalltail = temptail;
            }
            temphead = null;
            temptail = null;
            length -= k;
        }
        overalltail.next = currentnode;
        return overallhead;


    }
    public static void main(String[] args) {
        // Example: [1, 2, 3, 4, 5], k = 2
        Listnode head = new Listnode(1);
        head.next = new Listnode(2);
        head.next.next = new Listnode(3);
        head.next.next.next = new Listnode(4);
        head.next.next.next.next = new Listnode(5);
        Leetcode58 solution = new Leetcode58();
        Listnode result = solution.reverse(head, 2);
        Listnode current = result;
        while(current!=null){
            System.out.print(current.val + " ");
            current = current.next;

        }
    
    }
}
