class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) 
    {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int[]val:prerequisites)
        {
            graph.get(val[1]).add(val[0]);
        }
        int[] ans = new int[numCourses];
        int k =0;
        int[] ind = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            for(int nei:graph.get(i))
            {
                ind[nei]++;
            }
        }
        for(int i=0;i<numCourses;i++)
       {
        if(ind[i]==0)
        {
            q.offer(i);
        }
       }
       while(!q.isEmpty())
       {
        int node = q.poll();
        ans[k++]=node;
        for(int i:graph.get(node))
        {
            ind[i]--;
            if(ind[i]==0)
            {
                q.offer(i);
            }
        }
       }
        if(k != numCourses)
            return new int[0];
        return ans;
    }
}
