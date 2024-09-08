 class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
   
    }
    class Solution{
        public ListNode[]  splitparts(ListNode root,int k){
            ListNode[] ans = new ListNode[k];
            int length = getLength(root);
            int sublength = length/k;
            int remainder = length%k;
            ListNode prev = null;
            ListNode head = root;
            for(int i=0;i<k;++i,--remainder){
                ans[i] = head;
                for(int j=0;j<sublength+(remainder>0?1:0);++j){
                    prev = head;
                    head = head.next;
                }
                if (prev!=null)
                prev.next = null;
            }
            return ans;
        }
        private int getLength(ListNode root){
            int length = 0;
            for(ListNode curr=root;curr!=null;curr=curr.next)
            ++length;
            return length;
        }
    }
     class Leetcode239{
        public static void main(String [] args){
            ListNode root = new ListNode(1);
            root.next = new ListNode(2);
            root.next.next = new ListNode(3);
            root.next.next.next = new ListNode(4);
            root.next.next.next.next = new ListNode(5);
            root.next.next.next.next.next = new ListNode(6);
            root.next.next.next.next.next.next = new ListNode(7);
            root.next.next.next.next.next.next.next = new ListNode(8);
            root.next.next.next.next.next.next.next.next = new ListNode(9);
            root.next.next.next.next.next.next.next.next.next = new ListNode(10);
            Solution solution = new Solution();
            ListNode[] parts = solution.splitparts(root,3);
            for(ListNode part:parts){
                printList(part);
                System.out.println();
            }

        }
        private static void printList(ListNode node){
            while(node!=null){
                System.out.print(node.val + " ");
                node = node.next;
            }
        }
    }
