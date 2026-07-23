class Solution 
{
    Queue<int[]> q = new LinkedList<>();

    public void islandsAndTreasure(int[][] grid) 
    {
        int[][] dir = {
        {-1, 0},   // Up
        {1, 0},    // Down
        {0, -1},   // Left
        {0, 1}     // Right
        };
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty())
                {
                    int[] curr = q.poll();
                    int r=curr[0];
                    int c=curr[1];
                    for (int[] d : dir)
                    {
                        int nr = r + d[0];
                        int nc = c + d[1];
                        if(nr>=0&&nr<grid.length&&nc>=0&&nc<grid[0].length&&grid[nr][nc]==2147483647)
                        {
                            grid[nr][nc] = grid[r][c] + 1;
                            q.offer(new int[]{nr, nc});
                        }
                    }
                }
        
    }
}
