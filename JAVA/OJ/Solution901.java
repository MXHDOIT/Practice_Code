class StockSpanner {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public StockSpanner() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public int next(int price) {
      

        int count = 1;
        while(!stack1.isEmpty() && stack1.peek() <= price){
          stack1.pop();
          count += stack2.pop();
        }
        
        stack1.push(price);
        stack2.push(count);

        return stack2.peek();
}
    }