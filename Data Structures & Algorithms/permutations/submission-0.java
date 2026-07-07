class Solution 
{
    List<List<Integer>> res = new ArrayList<>();
    public void build(int[] nums, List<Integer> ans, int[] visited)
    {
        if(ans.size()==nums.length)
            {
                res.add(new ArrayList<>(ans));
                return;
            }
        for(int i=0;i<nums.length;i++)
        {

            if(visited[i]==0)
            {
                ans.add(nums[i]);
                visited[i]=1;
                build(nums,ans,visited);
                visited[i]=0;
            ans.remove(ans.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) 
    {
       List<Integer> ans = new ArrayList<>();
       int n = nums.length;
        int[] visited = new int[n];
        for(int i = 0;i<n;i++)
        {
            visited[i]=0;
        }
        build(nums,ans,visited);
        return res;
    }
}
