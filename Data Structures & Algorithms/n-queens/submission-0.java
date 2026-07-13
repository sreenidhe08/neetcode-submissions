class Solution 
{
    List<List<String>> res = new ArrayList<>();
    public void con(char[][] grid)
    {
        List<String> board = new ArrayList<>();

        for(char[] row : grid)
        {
            board.add(new String(row));
        }

        res.add(board);
        //return res;
    }
    public boolean issafe(char[][]ans,int col,int row,int n)
    {
        /*for(int i=0;i<n;i++)
        {
            if(ans[row][i]=='Q')
            {
                return false;
            }
        }*/
        for(int i=0;i<row;i++)
        {
            if(ans[i][col]=='Q')
            {
                return false;
            }
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--)
        {
            if(ans[i][j]=='Q')
            {
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++)
        {
            if(ans[i][j]=='Q')
                return false;
        }
        return true;

    }
    public void build(char[][]ans,int n,int row)
    {
        if(row==n)
        {
            con(ans);
            return; 
        }
        for(int i=0;i<n;i++)
        {
            if(issafe(ans,i,row,n))
            {
                ans[row][i]='Q';
                build(ans,n,row+1);
                ans[row][i]='.';
            } 
        }
    }
    public List<List<String>> solveNQueens(int n) 
    {
        char[][] ans = new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(ans[i], '.');
        }
        build(ans,n,0);
        return res;
    }
}
