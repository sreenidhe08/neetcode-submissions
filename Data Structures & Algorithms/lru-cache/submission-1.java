class LRUCache {
    HashMap<Integer,Integer> map;
    int capacity;
    public LRUCache(int capacity) 
    {
        map=new LinkedHashMap<>(capacity,0.75f,true);
        this.capacity=capacity;
        
    }
    
    public int get(int key) 
    {
     if(map.containsKey(key))
     return map.get(key);
     else 
     return -1;   
    }
    
    public void put(int key, int value) 
    {
        if (map.size() >= capacity && !map.containsKey(key)) {
            // The first key in the iterator is always the least recently used (oldest)
            int oldestKey = map.keySet().iterator().next();
            map.remove(oldestKey); 
        }
        // Add the new item
        map.put(key,value);
        
    }
}
