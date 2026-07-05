class Solution {
    List<List<Integer>> res = new ArrayList<>(); 
    public void build(int[] nums,List<Integer> ans,int i)
    {
       if(i==nums.length)
       {
        res.add(new ArrayList<>(ans));
        return;
       }
       ans.add(nums[i]);
       build(nums,ans,i+1);
       ans.remove(ans.size() - 1);
       build(nums,ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) 
    {
       List<Integer> ans = new ArrayList<>();
        build(nums,ans,0);
        return res;
    }
}
