class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> temp;
    public MinStack() 
    {
        stack=new Stack<>();
        temp=new Stack<>();
    }
    
    public void push(int val) 
    {
        stack.push(val);
        if(temp.isEmpty()||val<=temp.peek())
        {
            temp.push(val);
        }
    }
    
    public void pop() 
    {
        if(stack.isEmpty()) return;
        int top=stack.pop();
        if(top==temp.peek())
        temp.pop();
        
    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin() 
    {
        return temp.peek();

    }
}
