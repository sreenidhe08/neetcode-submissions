class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashmap = {}
        for i in nums:
            hashmap[i]=hashmap.get(i,0)+1
        list=sorted(hashmap.keys(),key=lambda x:hashmap[x],reverse=True)
        return list[:k]

        