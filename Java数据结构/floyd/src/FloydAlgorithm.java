import java.util.Arrays;
public class FloydAlgorithm {
    public static void main(String[] args) {
        char[] vertex = {'A','B','C','D','E','F','G'};
        int[][] matrix = new int[vertex.length][vertex.length];
        final int N = 65535; //表示不可以连接
        matrix[0] = new int[]{N,5,7,N,N,N,2};
        matrix[1] = new int[]{5,N,N,9,N,N,3};
        matrix[2] = new int[]{7,N,N,N,8,N,N};
        matrix[3] = new int[]{N,9,N,N,N,4,N};
        matrix[4] = new int[]{N,N,8,N,N,5,4};
        matrix[5] = new int[]{N,N,N,4,5,N,6};
        matrix[6] = new int[]{2,3,N,N,4,6,N};

        Graph graph = new Graph(vertex.length,matrix,vertex);
        graph.show();
    }
}


//创建图
class Graph{
    private char[] vertex; //存放顶点数组
    private int[][] dis;    //保存距离
    private int[][] pre;    //保存前驱
    
    //构造器
    public Graph(int length,int[][] matrix,char[] vertex){
        this.vertex = vertex;
        this.dis = matrix;
        this.pre =new int[length][length];
        //对pre初始化，注意存放的是前驱顶点的下标
        for (int i = 0; i < length; i++) {
            Arrays.fill(pre[i],i);
        }
    }

    //显示pre和dis数组
    public void show(){
        char[] vertex = {'A','B','C','D','E','F','G'};
        for (int i = 0; i < dis.length; i++) {
            for (int j = 0; j < dis.length; j++) {
                System.out.print(vertex[pre[i][j]]+" ");
            }
            System.out.println();
            for (int k = 0; k < dis.length; k++) {
                System.out.print("("+vertex[i]+"到"+vertex[k]+"的最短路劲是"+dis[i][k]+") ");
            }
            System.out.println();
        }
    }

    //弗洛伊德算法
    public void floyd(){
        int len = 0; //变量保存距离
        //对中间顶点遍历，k就是中间顶点的下标
        for (int i = 0; i < dis.length; i++) {
            for (int j = 0; j < dis.length; j++) {
                for (int k = 0; k < dis.length; k++) {
                    len = dis[j][i]+dis[i][k];
                    if(len < dis[j][k]){
                        dis[j][k] = len;
                        pre[j][k] = pre[i][k];
                    }
                }
            }
        }
    }
}