class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n = piles.length;
        int l=1;
        int hi = 0;
        for(int p : piles)
        {
             hi = Math.max(hi, p);
        }       
        int ans = Integer.MAX_VALUE;
        while(l<=hi)
        {
            int sum=0;
            int mid=l+(hi-l)/2;
            for(int i=0;i<n;i++)
            {
                sum+=Math.ceil((double)piles[i]/(double)mid);
            }
            if(sum<=h)
            {
                ans=mid;
                hi=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
        
    }
}
