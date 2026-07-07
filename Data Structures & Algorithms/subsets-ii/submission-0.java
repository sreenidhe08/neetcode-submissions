class Solution 
{
    List<List<Integer>> res = new ArrayList<>();
    public void build(int[] nums, List<Integer> ans,int i)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        build(nums,ans,i+1);
        ans.remove(ans.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[i]==nums[idx])
        {
            idx++;
        }
        build(nums,ans,idx);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        build(nums,ans,0);
        return res;
    }
}
