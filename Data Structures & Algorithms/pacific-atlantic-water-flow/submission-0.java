class Solution 
{
    int dir[][] = {
        {-1,0},{1,0},{0,-1},{0,1}
    };
    public void pacific(int[][]heights, boolean[][]visited,int i,int j)
    {
        if(i<0||i>=heights.length||j<0||j>=heights[0].length||visited[i][j])
        return;
        visited[i][j]=true;
        for(int[]d : dir)
        {
            int nr=i+d[0];
            int nc=j+d[1];
            if (nr >= 0 && nr < heights.length &&
            nc >= 0 && nc < heights[0].length &&
            !visited[nr][nc] &&
            heights[nr][nc] >= heights[i][j]) 
            {
                pacific(heights,visited,nr,nc);
            }
        }
    }
    public void atlantic(int[][]heights, boolean[][]visited,int i,int j)
    {
        if(i<0||i>=heights.length||j<0||j>=heights[0].length||visited[i][j])
        return;
        visited[i][j]=true;
        for(int[]d : dir)
        {
            int nr=i+d[0];
            int nc=j+d[1];
            if (nr >= 0 && nr < heights.length &&
            nc >= 0 && nc < heights[0].length &&
            !visited[nr][nc] &&
            heights[nr][nc] >= heights[i][j]) 
            {
                atlantic(heights,visited,nr,nc);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) 
    {
        List<List<Integer>> res = new ArrayList<>();
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                pacific(heights, pacific, i, 0);
                }

            for (int j = 0; j < n; j++) {
            pacific(heights, pacific, 0, j);
            }

            for (int i = 0; i < m; i++) {
    atlantic(heights, atlantic, i, n - 1);
}

for (int j = 0; j < n; j++) {
    atlantic(heights, atlantic, m - 1, j);
}
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(pacific[i][j]&&atlantic[i][j])
                {
                    res.add(new ArrayList<>(List.of(i,j)));
                }
            }
        }
      return res;  
    }
}
