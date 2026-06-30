class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> h = new PriorityQueue<>();
        for(int i:nums)
        {
            h.offer(i);
        }
        k=nums.length-k;
        while(k>0)
        {
            h.poll();
            k--;
        }
        return h.peek();
    }
}
