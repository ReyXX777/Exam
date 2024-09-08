class Listnode{
    int val;
    Listnode next;
    Listnode(int val){this.val = val;}
    Listnode(int val,Listnode head) {
        this.val = val;
        this.next = next;
    }
}
public class Leetcode190 {
    public Listnode oddever(Listnode head){
        Listnode odd = new Listnode(0);
        Listnode even = new Listnode(0);
        Listnode odd1 = odd;
        Listnode even1 = even;
        for(boolean isodd = true;head!=null;head = head.next,isodd = !isodd)
        if(isodd){
            odd1.next = head;
            odd1= odd1.next;

        }else {
            even1.next = head;
            even1 = even1.next;
        }
        odd1.next = even.next;
        even1.next = null;
        return odd.next;
    }
    public static void main(String [] args){
        Leetcode190 solution = new Leetcode190();
        Listnode head = new Listnode(1,new Listnode(2,new Listnode(3,new Listnode(4))));
        Listnode result = solution.oddever(head);
        while(result!=null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
}
