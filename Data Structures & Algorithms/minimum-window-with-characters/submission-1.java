class Solution {
    public String minWindow(String s, String t) 
    {
        if(s.length()<t.length())
        {
            return "";
        }

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        int left=0,formed=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;

        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int required=map.size();

        for(int right=0;right<s.length();right++)
        {
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(map.containsKey(c) && window.get(c).intValue()==map.get(c).intValue())
            {
                formed++;
            }
            while(formed==required)
            {
                if(right-left+1<minlen)
                {
                    minlen=right-left+1;
                    start=left;
                }
                char ch = s.charAt(left);
                window.put(ch,window.get(ch)-1);
                if(map.containsKey(ch)&&window.get(ch)<map.get(ch))
                {
                    formed--;
                }
                left++;
            }
        }
        if (minlen == Integer.MAX_VALUE) //when no valid substring found
            return "";
        return s.substring(start,start+minlen);
    }
}
