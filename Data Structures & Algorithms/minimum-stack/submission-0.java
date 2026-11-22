class MinStack {
        Stack<Integer> minItem = new Stack<>();
        Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }
    
    public void push(int val) {
        stack.push(val);

        if(minItem.isEmpty() || minItem.peek()>=val){
            minItem.push(val);
        }
    }
    
    public void pop() {
        int lastOne = stack.pop();
        if(minItem.peek()==lastOne){
            minItem.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minItem.peek();
    }
}
