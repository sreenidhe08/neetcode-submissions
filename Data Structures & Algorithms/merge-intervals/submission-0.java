class Solution {
    public int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        int i=1;
        while(i<intervals.length)
        {
            int[] c = intervals[i];
            int curr = c[0];
            int[] prev=ans.get(ans.size()-1);
            int p = prev[1];
            if(curr<=p)
            {
                prev[1]=Math.max(prev[1],c[1]);
            }
            else
            {
                ans.add(c);
            }
         i++;   
        }
     return ans.toArray(new int[ans.size()][]);   
    }
}
