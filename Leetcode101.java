public class Leetcode101 {
    public Listnode sortlist(Listnode head){
        if(head==null||head.next==null){
            return head;
        }
        Listnode mid = getmid(head);
        Listnode left = sortlist(head);
        Listnode right = sortlist(mid);
        return merge(left,right);
       


    }
    private Listnode getmid(Listnode head){
        Listnode fast = head;
        Listnode slow = head;
        Listnode prev = null;
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!=null){
            prev.next = null;
        }
        return slow;

    }
    private Listnode merge(Listnode l1,Listnode l2){
        Listnode dummy = new Listnode(0);
        Listnode tail = dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;

            }
            tail = tail.next;
        }
        tail.next = (l1!=null)?l1:l2;
        return dummy.next;
    }
    public static void main(String [] args){
        Listnode head = new Listnode (4,new Listnode(2,new Listnode(1,new Listnode(3))));
        Leetcode101 solution = new Leetcode101();
        Listnode sortedlist = solution.sortlist(head);
        System.out.println(sortedlist);
    }

    
}
class Listnode{
    int val;
    Listnode next;
    Listnode(int val){
        this.val = val;

    }
    Listnode(int val,Listnode next){
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Listnode curr = this;
        while(curr!=null){
            sb.append(curr.val).append("-->");
            curr = curr.next;

        }
        sb.append("null");
        return sb.toString();
    }

        }
    
