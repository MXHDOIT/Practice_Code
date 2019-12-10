public class CircleArrayQueue {
    private int maxSize;  //数组最大容量
    private int[]  array;
    private int rear;   //队尾指向最后一个节点的后一个位置
    private int head;   //队首

    public CircleArrayQueue() {

    }

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        this.rear = 0;
        this.head = 0;
    }

    /**
     * 判断是否队列满
     * @return
     */
    private boolean isFull(){
        if((rear+1)%maxSize==head){  //重点
            return true;
        }

        return false;
    }

    /**
     * 判断是否为空
     * @return
     */
    private boolean isEmpty(){
        return rear==head;
    }

    /**
     * 添加数据
     * @param data
     */
    public void addQueue(int data){
        if(isFull()){
            System.out.println("队列满，不能加入数据~");
            return;
        }

        array[rear] = data;
        rear=(rear+1)%maxSize;
    }

    /**
     * 获取元素
     * @return
     */
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        int value = array[head];
        head = (head+1)%maxSize;
        return value;
    }

    /**
     * 获取数组中元素个数
     * @return
     */
    public int size(){
        return (rear+maxSize-head)%maxSize;
    }


    /**
     * 打印数据
     */
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列空，没有元素~~");
            return;
        }

        for (int i = head; i < head+size(); i++) {
            System.out.print(i%maxSize+"="+array[i%maxSize]+"  ");
        }
        System.out.println();
    }

    /**
     * 显示队列的头数据，注意不是取出数据
     * @return
     */
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空，没有数据");
        }

        return array[head];
    }


}
