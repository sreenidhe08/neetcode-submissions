class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a1 = [0] * 26
        a2 = [0] * 26

        for i in s :
            a1[ord(i)-ord('a')]+=1
        for j in t:
            a2[ord(j)-ord('a')]+=1
        return a1==a2
        