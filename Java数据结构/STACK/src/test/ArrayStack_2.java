package test;

class ArrayStack_2 {
    private int[] stack;
    private int top = -1;
    private int maxSize;

    public ArrayStack_2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    /**
     * 栈满
     *
     * @return
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * 栈空
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     *
     * @param data
     */
    public void push(int data) {
        if (isFull()) {
            System.out.println("堆栈已满");
            return;
        }

        this.top += 1;
        this.stack[this.top] = data;
    }

    /**
     * 出栈
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            //抛出异常
            throw new RuntimeException("栈空，没有数据");
        }

        return this.stack[top--];
    }

    /**
     * 显示栈
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("没有数据");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(this.stack[i] + " ");
        }
    }

    //返回运算符的优先级，优先级是程序员来确定的，优先级使用数字来表示，数字越大，优先级越高
    public int prioririty(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;  //假定目前的表达式只有+，-，*，/
        }
    }

    //判断是不是一个运算符
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    //计算方法
    public int cal(int num1, int num2, int oper) {
        int res = 0;
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
            case '/':
                res = num1 / num2;
            default:
                break;
        }
        return res;
    }

    /**
     * 返回当前栈顶的值，但不是真正的pop
     * @return
     */
    public int peek(){
        return stack[top];
    }
}