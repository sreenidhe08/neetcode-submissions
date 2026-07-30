class Solution {
    public int networkDelayTime(int[][] times, int n, int k) 
    {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i = 0;i<n+1;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int[] arr : times)
        {
            int u = arr[0];
            int v = arr[1];
            int w=arr[2];
            graph.get(u).add(new int[]{v,w});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,k});
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;
        while(!pq.isEmpty())
        {
            int[] cur = pq.poll();
            int d = cur[0];
            int ne = cur[1];
            if(d>dist[ne]) continue;
            for(int[] nei : graph.get(ne))
            {
                int nxt = nei[0];
                int w = nei[1];
                if(d+w<dist[nxt])
                {
                    dist[nxt]=d+w;
                    pq.offer(new int[]{dist[nxt],nxt});
                }
            }
        }
        int ans = 0;
        for(int i=1;i<n+1;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)
            {
                return -1;
            }
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}
