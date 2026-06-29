class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {
       PriorityQueue<Integer> h = new PriorityQueue<>((a,b)->{int da=points[a][0]*points[a][0]+points[a][1]*points[a][1];
                                                            int db = points[b][0]*points[b][0]+points[b][1]*points[b][1];
                                                            return db-da;});
        for(int i = 0;i<points.length;i++)
        {
            h.offer(i);
            if(h.size()>k)
            {
                h.poll();
            }
        }
        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            ans[i] = points[h.poll()];
        }
        return ans;
    }
}
