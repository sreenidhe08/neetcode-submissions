class Solution:
    def maxArea(self, heights: List[int]) -> int:
        area=0
        left=0
        right=len(heights)-1
        while left<right:
            w=right-left
            h=min(heights[left],heights[right])
            area=max(area,w*h)
            if heights[left]<heights[right]:
                left+=1
            else:
                right-=1
        return area
        