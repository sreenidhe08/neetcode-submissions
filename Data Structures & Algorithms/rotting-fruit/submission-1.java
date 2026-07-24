class Solution {
    public int orangesRotting(int[][] grid) 
    {
        int count=0;
      Queue<int[]> q = new LinkedList<>();
        int[][] dir = {
            {-1,0},{1,0},{0,-1},{0,1}
        };
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                q.offer(new int[]{i,j});
            }
        }
        while(!q.isEmpty())
        {
            boolean flag=false;
            int s = q.size();
            for(int i=0;i<s;i++)
            {
            int[] curr= q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int[] d:dir)
            {
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length &&grid[nr][nc]==1)
                {
                    grid[nr][nc]=2;
                    q.offer(new int[]{nr,nc});
                    flag=true;
                }
            }   
            }
            if(flag) count++;
        }
      for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                return -1;
            }
        }  
        return count;
        
    }
}
