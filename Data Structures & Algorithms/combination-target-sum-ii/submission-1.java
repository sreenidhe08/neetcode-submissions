class Solution 
{
    List<List<Integer>> res = new ArrayList<>();
    void build(int[] nums,List<Integer> ans,int i,int rem)
    {
        if(rem==0)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        if(i==nums.length || rem<0)
        {
            return;
        }
        ans.add(nums[i]);
        rem-=nums[i];
        build(nums,ans,i+1,rem);
        ans.remove(ans.size()-1);
        rem+=nums[i];
        int idx=i+1;
        while(idx<nums.length && nums[i]==nums[idx])
        {
            idx++;
        }
        build(nums,ans,idx,rem);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
       List<Integer> ans = new ArrayList<>();
       Arrays.sort(candidates);
        build(candidates,ans,0,target);
        return res;
    }
}
