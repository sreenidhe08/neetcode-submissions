class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Case 1: Include first, exclude last
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n - 1; i++) {
            int temp = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = temp;
        }

        int case1 = prev1;

        // Case 2: Exclude first, include last
        prev2 = nums[1];
        prev1 = Math.max(nums[1], nums[2]);

        for (int i = 3; i < n; i++) {
            int temp = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = temp;
        }

        int case2 = prev1;

        return Math.max(case1, case2);
    }
}