class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int count=0;
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums)
        {
            h.add(i);
        }
        //int longest = 0;
        for(int num:h)
        {
            if(!h.contains(num-1))
            {
               int curr=num;
               int temp=1; 
                while(h.contains(curr+1))
                {
                    curr++;
                    temp++;
                }
                count=Math.max(temp,count);
                //temp=0;
            }
        }

       return count; 
    }
}
