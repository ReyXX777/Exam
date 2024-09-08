class Leetcode102{
    public Node construct(int[][] grid){
        return helper(grid,0,0,grid.length);
    }
    private Node helper(int [][] grid,int i,int j,int w){
        if(allsame(grid,i,j,w))
        return new Node (grid[i][j]==1,true);,
        int half = w/2;
        return new Node(true,false,
        helper(grid,i,j,half),
        helper(grid,i,j+half,half),
        helper(grid,i+half,j,helf),
        helper(grid,i+half,j+half,half));
    }
    private boolean allsame(int [][] grid,int i,int j,int w){
        for(int x=i;x<i+w;++i)
        for(int y=j;y<j+w;++y)
        if(grid[x][y]!=grid[i][j])
        return false;
        return true;

    }
    public static void main(String [] args){
        int [][]grid = {
            {1, 1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0, 0, 0}
        } ;
        Leetcode102 solution = new Leetcode102();
        Node root = solution.construct(grid);
        System.out.println(root);


    }
}
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
    }
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", isLeaf=" + isLeaf +
                ", topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
