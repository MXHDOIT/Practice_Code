import java.util.Scanner;

public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        CircleArrayQueue queue = new CircleArrayQueue(4);
        char key = ' ';//接受选择字符
        Scanner in = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            System.out.println("s:打印队列");
            System.out.println("e:退出程序");
            System.out.println("a:添加数据");
            System.out.println("g:获取数据");
            System.out.println("h:查看队列头的数据");

            key = in.next().charAt(0);

            switch (key){
                case 's':
                    queue.showQueue();
                    break;
                case 'e':
                    loop = false;
                    break;
                case 'a':
                    System.out.println("请输入数据");
                    queue.addQueue(in.nextInt());
                    break;
                case 'g':
                    System.out.println(queue.getQueue());
                    break;
                case 'h':
                    System.out.println(queue.headQueue());
                    break;
                    default:
                        break;
            }
        }
        System.out.println("程序退出~");
    }
}
