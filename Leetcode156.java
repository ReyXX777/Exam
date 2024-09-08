class Listnode{
    int val;
    Listnode next;
    Listnode(int val){this.val = val;}
    Listnode(int val,Listnode next) {this.val=val;this.next=next;}
}
public class Leetcode156 {
    public boolean ispallindrome(Listnode head){
        Listnode slow = head;
        Listnode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        } 
        if(fast!=null)
            slow = slow.next;
            slow = reverse(slow);
            while(slow!=null){
                if(slow.val!=head.val)
                return false;
                slow = slow.next;
                head = head.next;
            }
            return true;
        }
        private Listnode reverse(Listnode head){
            Listnode prev = null;
            while(head!=null){
                Listnode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
        public static void main(String [] args){
            Leetcode156 solution = new Leetcode156();
            Listnode head = new Listnode(1,new Listnode(2,new Listnode(2,new Listnode(1))));
            System.out.println(solution.ispallindrome(head));
        }

    }
    

