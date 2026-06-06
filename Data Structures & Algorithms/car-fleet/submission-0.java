class Solution {
    public int carFleet(int target, int[] position, int[] speed) 
    {
        int m=position.length;
        double time=0;
        Stack<Double> st = new Stack<>();
        int[][] p = new int[m][2];
        for(int i=0;i<m;i++)
        {
           p[i][0]=position[i];
           p[i][1]=speed[i]; 
        }
        Arrays.sort(p,(a,b)->a[0]-b[0]);
        for(int i=m-1;i>=0;i--)
        {
            time=(double)(target-p[i][0])/p[i][1];
            if(st.isEmpty()||time>st.peek())
            {
                st.push(time);
            }
            
        }
      return st.size(); 
    }
}
