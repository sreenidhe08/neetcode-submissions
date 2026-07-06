class Solution 
{
    List<List<Integer>> res = new ArrayList<>();
    public void build(int[] nums,List<Integer> ans,int i,int rem)
    {
       if(rem==0)
       {
        res.add(new ArrayList<>(ans));
        return;
       } 
       if(rem<0 || i==nums.length)
       return;

       ans.add(nums[i]);
       rem-=nums[i];
       build(nums,ans,i,rem);
       ans.remove(ans.size()-1);
       rem+=nums[i];
       build(nums,ans,i+1,rem);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        List<Integer> ans = new ArrayList<>();
        build(nums,ans,0,target);
    return res;
    }
}
