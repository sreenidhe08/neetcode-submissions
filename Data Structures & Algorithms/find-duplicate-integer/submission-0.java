class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxkey = Integer.MIN_VALUE;
        int maxval = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>maxval)
            {
                maxval=entry.getValue();
                maxkey=entry.getKey();
            }
        }
        return maxkey;
    }
}
