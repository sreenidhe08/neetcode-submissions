class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        int n = heights.length;
        int[]ln=new int[n];
        int[]rn=new int[n];
        Stack<Integer> st = new Stack<>();
        int ans=0;

        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            rn[i]=(st.isEmpty())?n:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            ln[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++)
        {
            int ca=heights[i]*(rn[i]-ln[i]-1);
            ans=Math.max(ans,ca);
        }
    return ans;
    }
}
