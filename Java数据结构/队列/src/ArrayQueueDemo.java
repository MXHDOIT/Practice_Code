import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';//接收用户输入
        boolean loop = true;
        while(loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = in.next().charAt(0);//接收一个字符

            switch (key) {
                case 's':
                    arrayQueue.show();
                    break;
                case 'a':
                    System.out.println("输入一个数：");
                    arrayQueue.add(in.nextInt());
                    break;
                case 'g':

                    try {
                        int res = arrayQueue.pop();
                        System.out.println(res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
//                    in.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;


    //初始化队列
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[this.maxSize];
    }

    //判断队列是否满
    public boolean isFull(){
        return rear==maxSize-1;
    }


    //判断队列是否为空
    public boolean isNull(){
        return rear == front;
    }

    //添加数据到队列
    public void add(int data){
        if(isFull()){
            System.out.println("队列满，不能加入数据");
            return ;
        }

        this.rear++;

        this.arr[this.rear] = data;
    }

    //取数据
    public int pop(){
        if(isNull()){
            throw new RuntimeException("队列空");
        }
        this.front++;
        return arr[front];
    }


    public void show(){
        if(isNull()) {
            System.out.println("空");
        }

        for (int i = 0; i <= rear ; i++) {
            System.out.println(arr[i]);
        }
    }

}