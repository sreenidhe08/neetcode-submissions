class Solution 
{
    List<List<String>> res = new ArrayList<>();
    public boolean ispal(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void build(String s, List<String> ans,int i)
    {
        if(i==s.length())
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int end = i;end<s.length();end++)
        {
            String part = s.substring(i, end + 1);
            if(ispal(part))
            {
                 ans.add(s.substring(i, end + 1));
                build(s,ans,end+1);
                ans.remove(ans.size()-1);
            }
        }   
    }
    public List<List<String>> partition(String s) 
    {
        List<String> ans = new ArrayList<>();
        build(s,ans,0);
        return res;
    }
}
