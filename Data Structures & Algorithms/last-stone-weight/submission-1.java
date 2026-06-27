class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
        {
            heap.offer(i);
        }
        while(heap.size()>1)
        {
        int x = heap.poll();
        int y = heap.poll();
        if(x-y!=0)
        heap.offer(x-y);
        }
        return heap.isEmpty()?0:heap.peek();
    }
}
