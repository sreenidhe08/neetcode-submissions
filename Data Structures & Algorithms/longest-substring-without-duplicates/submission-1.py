class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        hashmap={}
        left=0
        m=0
        for right in range(0,len(s)):
            if s[right] in hashmap and hashmap[s[right]]>=left:
                left=hashmap[s[right]]+1
            hashmap[s[right]]=right
            m=max(m,right-left+1)
        return m
            
        