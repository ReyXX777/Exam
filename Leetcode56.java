class Node{
    int val;
    Node next;
    Node random;
    public Node(int n){
        this.val = n;
        this.next =null;
        this.random = null;
    }
}
public class Leetcode56 {
    public Node deepcode(Node head){
        if(head == null) return null;
        Node current = head;
        while(current!=null){
Node newnode = new Node(current.val);
newnode.next = current.next;
current.next = newnode;
current = newnode.next;
        }
        current = head;
        while(current!=null){
            if(current.random!=null){
                current.next.random = current.random.next;

            }
            current = current.next.next;
        }
        current = head;
        Node psuedohead = new Node(0);
        Node copy = psuedohead;
        while(current!=null){
            copy.next = current.next;
            copy = copy.next;
            current.next = current.next.next;
            current = current.next;

        }
        return psuedohead.next;
    }
    public static void main(String [] args){
        Node head1 = new Node(7);
        head1.next = new Node(13);
        head1.next.next = new Node(11);
        head1.next.next.next = new Node(10);
        head1.next.next.next.next = new Node(1);
        head1.random = null;
        head1.next.random = head1;
        head1.next.next.random = head1.next.next.next.next;
        head1.next.next.next.random = head1.next.next;
        head1.next.next.next.next.random = head1;
        Leetcode56 solution = new Leetcode56();
        Node copyNode = solution.deepcode(head1);
        Node current = copyNode;
        while(current!=null){
            System.out.println("node value" + current.val);
            if(current.random!=null){
                System.out.println("random points to"+current.random.val);

            }else{
                System.out.println("it points to none");
            }
            current = current.next;
        }
    }
    
}
