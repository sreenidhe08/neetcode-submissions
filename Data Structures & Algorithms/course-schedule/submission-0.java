class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
       ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
       for(int i=0;i<numCourses;i++)
       {
        graph.add(new ArrayList<>());
       }
       for(int[] n:prerequisites)
       {
        graph.get(n[0]).add(n[1]);
       } 

       int[] ind = new int[numCourses];
       Queue<Integer> q = new LinkedList<>();
       for(int i=0;i<numCourses;i++)
       {
        for(int nei : graph.get(i))
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
       List<Integer> ans = new ArrayList<>();
       while(!q.isEmpty())
       {
        int node = q.poll();
        ans.add(node);
        for(int i:graph.get(node))
        {
            ind[i]--;
            if(ind[i]==0)
            {
                q.offer(i);
            }
        }
       }
       return ans.size()==numCourses;
    }
}
