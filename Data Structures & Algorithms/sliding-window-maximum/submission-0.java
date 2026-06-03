class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            maxheap.offer(nums[i]);
        }
        l.add(maxheap.peek());

        for(int i=k;i<nums.length;i++)
        {
            maxheap.remove(nums[i-k]);
            maxheap.offer(nums[i]);
            l.add(maxheap.peek());
        }
        int[] res = l.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return res;
    }
}
