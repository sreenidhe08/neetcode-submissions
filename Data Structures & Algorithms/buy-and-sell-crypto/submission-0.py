class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min=prices[0]
        m=0
        for i in range(0,len(prices)):
            if min>prices[i]:
                min=prices[i]
            m=max(m,prices[i]-min)
        return m

        