class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.strip();
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                str.append(Character.toLowerCase(c));
            }
        }
        
        int left=0,right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
