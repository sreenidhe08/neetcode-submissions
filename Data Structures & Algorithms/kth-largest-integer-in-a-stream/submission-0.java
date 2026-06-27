class KthLargest {
    PriorityQueue<Integer> heap;
    int k;
    public KthLargest(int k, int[] nums) 
    {
        this.k=k;
        heap = new PriorityQueue<>();
        for(int i: nums)
        {
            heap.offer(i);
        }
    }
    
    public int add(int val) 
    {
        heap.offer(val);
        while(heap.size()>k)
        {
            heap.poll();
        }
        return heap.peek();
    }
}
