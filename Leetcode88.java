import java.util.*;

public class Leetcode88 {
    public int snakeladder(int [][] board){
        final int n = board.length;
        int ans = 0;
        Queue<Integer> q = new ArrayDeque<>(Arrays.asList(1));
        boolean [] seen = new boolean[1+n*n];
        int [] a = new int[1+n*n];
        for(int i=0;i<n;++i)
            for(int j=0;j<n;j++)
            a[(n-1-i)*n+((n-i)%2==0?n-j:j+1)] = board[i][j];
            while(!q.isEmpty()){
                ++ans;
                for(int sz=q.size();sz>0;--sz){
                    final int curr = q.poll();
                    for(int next = curr+1;next<=Math.min(curr+6,n*n);++next){
                        final int dest = a[next]>0?a[next]:next;
                        if(dest==n*n)
                        return ans;
                        if(seen[dest])
                        continue;
                        q.offer(dest);
                        seen[dest]=true;

                    }
                }
            }
            return -1;

            }
            public static void main(String [] args){
                Leetcode88 solution = new Leetcode88();
                int [][] board = {
                    {-1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1},
                    {-1, 35, -1, -1, 13, -1},
                    {-1, -1, -1, -1, -1, -1},
                    {-1, 15, -1, -1, -1, -1}
                };
                System.out.println(solution.snakeladder(board));

            }
        }
    
