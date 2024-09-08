class Listnode{
    int val;
    Listnode next;
    Listnode(int val) {this.val=val;}
    Listnode(int val,Listnode next) {this.val=val;this.next=next;}
}
public class Leetcode155 {
    public Listnode intersect(Listnode head1,Listnode head2){
        Listnode a = head1;
        Listnode b = head2;
        while(a!=b){
            a = b ==null? head2:a.next;
            b=b==null?head1:b.next;
        }
        return a;

    }
    public static void main(String [] args){
        Leetcode155 solution = new Leetcode155();
        Listnode head1 = new Listnode(1,new Listnode(2,new Listnode(3,new Listnode(4))));
        Listnode head2 = new Listnode(5,new Listnode(6,new Listnode(7,new Listnode(8))));
        Listnode intersect = solution.intersect(head1, head2);
        if(intersect!=null){
            System.out.println(intersect.val);
        }else {
            System.out.println("no intersection found");
        }

    }
    
}
