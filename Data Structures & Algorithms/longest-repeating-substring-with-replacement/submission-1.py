class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        freq=[0]*26
        left=0
        maxfreq=0
        ans=0
        for right in range(0,len(s)):
            freq[ord(s[right])-ord('A')]+=1;
            maxfreq=max(maxfreq,freq[ord(s[right])-ord('A')])
            while ((right-left+1) - maxfreq) > k:
                freq[ord(s[left])-ord('A')]-=1
                left+=1
            ans=max(ans,right-left+1)
        return ans



        