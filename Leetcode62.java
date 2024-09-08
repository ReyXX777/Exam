public class Leetcode62 {
    public Listnode partition(Listnode head,int k){
        Listnode fdum = new Listnode(0),bdum =new Listnode(0),
        front = fdum,back = bdum,curr=head;
        while(curr!=null){
            if(curr.val<k){
front.next = curr;
front = curr;
            }else{
                back.next = curr;
                back = curr;
            }
            curr = curr.next;
        }
        front.next = bdum.next;
        back.next = null;
        return fdum.next;

    }
    public static void main(String [] args){
        Listnode head = new Listnode(1);
        head.next = new Listnode(4);
        head.next.next = new Listnode(3);
        head.next.next.next = new Listnode(2);
        head.next.next.next.next = new Listnode(5);
        head.next.next.next.next.next = new Listnode(2);
        int k =3;
        Leetcode62 solution = new Leetcode62();
        Listnode result = solution.partition(head,k);
        System.out.println("partitioned");
        while(result!=null){
            System.out.print(result.val + " ");
            result = result.next;
        }


    }
    
}
