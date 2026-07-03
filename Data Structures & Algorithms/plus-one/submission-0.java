class Solution {
    public int[] plusOne(int[] digits) 
    {
        int carry = 1;
        int sum = 0;
        int n= digits.length;
        for(int i=n-1;i>=0;i--)
        {
            sum = digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        if(carry!=0)
        {
            int[] res = new int[n+1];
            res[0]=carry;
            int k=0;
            for(int i=1;i<n;i++)
            {
                res[i]=digits[k++];
            }
            return res;
        }
        return digits;
    }
}
