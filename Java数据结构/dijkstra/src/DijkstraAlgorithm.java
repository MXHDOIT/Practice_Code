import java.util.Arrays;
public class DijkstraAlgorithm {
    public static void main(String[] args) {
        char[] vertex = {'A','B','C','D','E','F','G'};

        //领接矩阵
        int[][] matrix = new int[vertex.length][vertex.length];
        final int N = 65535; //表示不可以连接
        matrix[0] = new int[]{N,5,7,N,N,N,2};
        matrix[1] = new int[]{5,N,N,9,N,N,3};
        matrix[2] = new int[]{7,N,N,N,8,N,N};
        matrix[3] = new int[]{N,9,N,N,N,4,N};
        matrix[4] = new int[]{N,N,8,N,N,5,4};
        matrix[5] = new int[]{N,N,N,4,5,N,6};
        matrix[6] = new int[]{2,3,N,N,4,6,N};

        Graph graph = new Graph(vertex,matrix);

        graph.showGraph();
        graph.dsj(2);
        graph.showDijkstra();
    }
}

class  Graph{
    private char[] vertex; //顶点数组
    private int[][] matrix; //领接矩阵
    private VisitedVertex vv; //已经访问的顶点集合
    //构造器

    public Graph(char[] vertex, int[][] matrix) {
        this.vertex = vertex;
        this.matrix = matrix;
    }

    //显示图
    public void showGraph(){
        for(int[] link:matrix){
            System.out.println(Arrays.toString(link));
        }
    }

    //迪杰斯特拉算法实现
    public void dsj(int index){
        vv = new VisitedVertex(vertex.length,index);
        update(index);
        for(int i = 1;i < vertex.length;i++){
            index = vv.updateArr();
            update(index);
        }
    }

    public void update(int index){
        int len = 0;
        for(int i = 0;i < matrix[index].length;i++){
            len = vv.getDis(index)+matrix[index][i];
            if(!vv.in(i) && len < vv.getDis(i)){
                vv.updatePre(i,index);
                vv.updateDis(i,len);
            }
        }
    }

    public void showDijkstra(){
        vv.show();
    }
}

//已访问顶点集合
class VisitedVertex{
    //记录各个顶点是否被访问，访问为1
    public int[] already_arr;
    //每个下标对应的值为前一个顶点下标
    public int[] pre_visited;
    //记录出发顶点到其他顶点的距离
    public int[] dis;

    public VisitedVertex(int length,int index) {
        this.already_arr = new int[length];
        this.pre_visited = new int[length];
        this.dis = new int[length];

        Arrays.fill(dis,65535);
        this.dis[index] = 0;
        this.already_arr[index] = 1;
    }

    //判断index顶点是否被访问过
    public boolean in(int index){
        return this.already_arr[index] == 1;
    }

    //更新pre这个顶点的前驱顶点为index顶点
    public void updatePre(int pre,int index){
        pre_visited[pre] = index;
    }

    //返回出发顶点到index顶点的距离
    public int getDis(int index){
        return dis[index];
    }

    //更新出发顶点到index顶点的距离
    public void updateDis(int index,int len){
        dis[index] = len;
    }

    public int updateArr(){
        int min = 65535,index = 0;
        for (int i = 0; i < already_arr.length; i++) {
            if(already_arr[i] == 0&& dis[i] < min){
                min = dis[i];
                index = i;
            }
        }
        already_arr[index] = 1;
        return index;
    }

    public void show(){
        System.out.println("++++++++++++++++++++");
        System.out.println(Arrays.toString(already_arr));
        System.out.println(Arrays.toString(pre_visited));
        System.out.println(Arrays.toString(dis));
    }
}