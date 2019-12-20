package test;

public class ArrayStack {
    private int[] stack;
    private int top = -1;
    private int maxSize;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    /**
     * 栈满
     * @return
     */
    public boolean isFull(){
        return top == maxSize-1;
    }

    /**
     * 栈空
     * @return
     */
    public boolean isEmpty(){
        return top==-1;
    }

    /**
     * 入栈
     * @param data
     */
    public void push(int data){
        if(isFull()){
            System.out.println("堆栈已满");
            return ;
        }

        this.top += 1;
        this.stack[this.top] = data;
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
        if(isEmpty()){
            //抛出异常
            throw new RuntimeException("栈空，没有数据");
        }

        return this.stack[top--];
    }

    /**
     * 显示栈
     */
    public void list(){
        if(isEmpty()){
            System.out.println("没有数据");
            return;
        }

        for(int i = top;i>=0;i--){
            System.out.print(this.stack[i]+" ");
        }
    }
}
