class Listnode{
    int val;
    Listnode next;
    Listnode () {}
    Listnode (int val) {this.val = val;}
    Listnode (int val,Listnode next) {this.val = val; this.next = next;}
}
public class Leetcode57 {
    public Listnode reverse(Listnode head,int left,int right){
        if(left==1)
           return reverse(head,right);
           head.next = reverse(head.next,left-1,right-1);
           return head;
        
    }
        private Listnode reverse(Listnode head,int n){
            if(n==1)
                return head;
            Listnode newhead = reverse(head.next,n-1);
            Listnode headnext = head.next;
            head.next = headnext.next;
            headnext.next = head;
            return newhead;


        }
        public static void main(String []args){
            Listnode head = new Listnode(1);
            head.next = new Listnode(2);
            head.next.next = new Listnode(3);
            head.next.next.next = new Listnode(4);
            head.next.next.next.next = new Listnode(5);
Leetcode57 solution = new Leetcode57();
Listnode result = solution.reverse(head,2,4);
Listnode current = result;
while(current!=null){
    System.out.println(current.val + " ");
    current  = current.next;
}

}  

    }
    

