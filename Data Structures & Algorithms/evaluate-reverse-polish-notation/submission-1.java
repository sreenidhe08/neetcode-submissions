class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>();
        int d1,d2,ans;
        for(int i=0;i<tokens.length;i++)
        {
            String c = tokens[i];
            if(!c.equals("+")&&!c.equals("-")&&!c.equals("*")&&!c.equals("/"))
            {
                int n = Integer.parseInt(c);
                stack.push(n);
            }
            else
            {
                
                    if(c.equals("+"))
                    {
                        d1= stack.pop();
                        d2= stack.pop();
                        ans=d1+d2;
                        stack.push(ans);
                    } 
                               
                    else if (c.equals("-"))
                    {
                        d1= stack.pop();
                        d2= stack.pop();
                        ans=d2-d1;
                        stack.push(ans);
                    } 
                    else if (c.equals("*"))
                    {
                        d1= stack.pop();
                        d2= stack.pop();
                        ans=d1*d2;
                        stack.push(ans);
                    }
                    else 
                    {
                        d1= stack.pop();
                        d2= stack.pop();
                        ans=d2/d1;
                        stack.push(ans);
                    }  

            }
        }
     return stack.pop();   
    }
}
