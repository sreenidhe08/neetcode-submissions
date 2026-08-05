class Solution 
{
    public int help(int n,int[] dp)
    {
        if(n==1||n==2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=help(n-1,dp)+help(n-2,dp);
    }
    public int climbStairs(int n) 
    {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=-1;
        }
        int w = help(n,dp);
        return w;
    }
}
