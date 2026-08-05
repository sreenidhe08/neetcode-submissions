class Solution {
    public int rob(int[] nums) 
    {
        //int[]dp = new int[nums.length];
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int prev2=nums[0];
        int prev1=Math.max(nums[1],prev2);
        int temp=prev1;
        for(int i=2;i<nums.length;i++)
        {
            temp=Math.max(prev1,nums[i]+prev2);
            prev2=prev1;
            prev1=temp;
        }
      return temp;  
    }
}
