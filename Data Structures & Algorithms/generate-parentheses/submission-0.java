class Solution 
{
    List<String> res = new ArrayList<>();
    public void build(int o, int c, String ans,int n)
    {
        if(o==n && c==n)
        {
            res.add(ans);
            return;
        }
        if(o<n)
        {
            build(o+1,c,ans+'(',n);
        }
        if(o>c && c<n)
        {
            build(o,c+1,ans+')',n);
        }
    } 
    public List<String> generateParenthesis(int n) 
    {
        int o=0;
        int c=0;
        build(o,c,"",n);
        return res;
    }
}
