public class Leetcode100 {
    public Treenode sortedtobst(int [] nums){
        return build(nums,0,nums.length-1);
    }
    private Treenode build(int [] nums,int l,int r){
        if(l>r)
        return null;
        final int m = (l+r)/2;
        return new Treenode(nums[m],build(nums,l,m-1),build(nums,m+1,r));

    }
    public static void main(String [] args){
        int[] nums = {-10, -3, 0, 5, 9};
        Leetcode100 solution = new Leetcode100();
        Treenode root = solution.sortedtobst(nums);
        System.out.println(root);
    }
    
}
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode(int val){
        this.val=val;
    }
    Treenode(int val,Treenode left,Treenode right){
        this.val=val;
        this.right=right;
        this.left=left;
    }
    @Override
    public String toString(){
        return "Treenode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

}
