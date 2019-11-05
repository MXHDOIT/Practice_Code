public class Stack {
    private int MAXSIZE;
    private int top;
    private int[] stList;

    public Stack() {
        MAXSIZE = 50;
        stList = new int[MAXSIZE];
    }

    public Stack(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
        stList = new int[MAXSIZE];
    }

    public boolean isEmpty(){
        if(this.top == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.top == this.MAXSIZE){
            return true;
        }
        return false;
    }

    public void push(int x){
        if(this.isFull()){
           return;
        }
        this.stList[this.top++] = x;
    }

    public int pop(){
        if(this.isEmpty()){
            return -1;
        }
        top--;
        return this.stList[top];
    }
}
