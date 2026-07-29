class Solution 
{
    public void dfs(char[][] board,int i,int j)
    {
        int[][] dir = {
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
        };
        board[i][j]='S';
        for(int[]d : dir)
        {
            int nr=i+d[0];
            int nc = j+d[1];
            if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length && board[nr][nc]=='O')
            {
                dfs(board,nr,nc);
            }
        }
        
    }
    public void solve(char[][] board) 
    {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(board,i,0);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(board[i][n-1]=='O')
            {
                dfs(board,i,n-1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(board,0,i);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(board[m-1][i]=='O')
            {
                dfs(board,m-1,i);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(board[i][j]=='O')
                board[i][j]='X';
                else if(board[i][j]=='S')
                board[i][j]='O';
            }
        }
        
    }
}
