import java.util.Arrays;
public class PrimAlgorithm {
    public static void main(String[] args) {
        char[] data=new char[]{'A','B','C','D','E','F','G'};
        int verxs = data.length;

        int[][] weight = new int[][]{
                {10000,5,7,10000,10000,10000,2} ,
                {5,10000,10000,9,10000,10000,3} ,
                {7,10000,10000,10000,8,10000,10000} ,
                {10000,9,10000,10000,10000,4,10000} ,
                {10000,10000,8,10000,10000,5,4} ,
                {10000,10000,10000,4,5,10000,6} ,
                {2,3,10000,10000,4,6,10000} ,
        };

        //创建MGraph对象
        MGraph graph = new MGraph(verxs);
        //创建MinTree对象
        MinTree minTree = new MinTree();
        minTree.createGraph(graph,verxs,data,weight);
        //输出
        minTree.showGraph(graph);

        minTree.prim(graph,0);
    }
}

//创建最小生成树
class MinTree{

    //创建图的领接矩阵
    public void createGraph(MGraph graph,int verxs,char data[],int[][] weight){
        for(int i = 0;i <verxs;i++){
            graph.data[i] = data[i];
            for(int j = 0;j < verxs;j++){
                graph.weight[i][j] = weight[i][j];
            }
        }
    }

    //显示图的领接矩阵
    public void showGraph(MGraph graph){
        for(int[] link:graph.weight){
            System.out.println(Arrays.toString(link));
        }
    }

    //编写prim算法
    public void prim(MGraph graph,int v){
        //标记是否访问过
        int[] visited = new int[graph.verxs];

        //把当前节点标志为1
        visited[v] = 1;
        //用top1与top2表示两个顶点下标
        int top1 = -1;
        int top2 = -1;
        int minWeight = 10000;

        for(int k =1;k < graph.verxs;k++){
            minWeight = 10000;
            for(int i = 0;i < graph.verxs;i++){
                for(int j = 0;j < graph.verxs;j++){
                    if(visited[i] == 1 && visited[j]==0 && graph.weight[i][j] < minWeight){
                        top1 = i;
                        top2 = j;
                        minWeight = graph.weight[i][j];
                    }
                }
            }

            System.out.println("边<"+graph.data[top1]+","+graph.data[top2]+">权值："+minWeight);
            visited[top2] = 1;
        }
    }
}

//创建图
class MGraph{
    int verxs;  //表示图的节点
    char[] data;  //存放节点数据
    int[][] weight; //存放边，就是我们的领接矩阵

    public MGraph(int verxs) {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}
