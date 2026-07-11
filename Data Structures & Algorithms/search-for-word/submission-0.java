class Solution 
{
    public boolean dfs(char[][] board, String word,int i,int j,int idx,boolean[][] visited)
    {
        if(word.length()==idx)
        {
            return true;
        }
        if(i<0 ||i>=board.length ||j<0||j>=board[0].length)
        {
            return false;
        }
        if(visited[i][j])
                return false;
        if(board[i][j] != word.charAt(idx))
            return false;

            visited[i][j]=true;
            boolean found = dfs(board,word,i-1,j,idx+1,visited)
            ||dfs(board,word,i+1,j,idx+1,visited)
            ||dfs(board,word,i,j-1,idx+1,visited)
            ||dfs(board,word,i,j+1,idx+1,visited);
            
             visited[i][j]=false;  
             return found;
    }
    public boolean exist(char[][] board, String word) 
    {
        boolean[][] visited=new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if (dfs(board, word, i, j, 0, visited))
                return true;
            }
        }
        return false;
    }
}
