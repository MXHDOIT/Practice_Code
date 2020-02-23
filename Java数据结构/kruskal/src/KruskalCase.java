public class KruskalCase {
    private int edgeNum; // 边的个数
    private char[] vertexs; //顶点数组
    private int[][] matrix;//领接矩阵
    //使用INF表示两个顶点不能联通
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        char[] vertexs = {'A','B','C','D','E','F','G'};

        int[][] matrix = {
                {0,12,INF,INF,INF,16,14},
                {12,0,10,INF,INF,7,INF},
                {INF,10,0,3,5,6,INF},
                {INF,INF,3,0,4,INF,INF},
                {INF,INF,5,4,0,2,8},
                {16,7,6,INF,2,0,9},
                {14,INF,INF,INF,8,9,0}};

        KruskalCase kruskalCase = new KruskalCase(vertexs,matrix);

        kruskalCase.print();
        kruskalCase.kruskal();
    }

    //构造器
    public KruskalCase(char[] vertexs, int[][] matrix) {
        this.vertexs = new char[vertexs.length];
        for(int i = 0;i < vertexs.length;i++){
            this.vertexs[i] = vertexs[i];
        }

        this.matrix = new int[vertexs.length][vertexs.length];
        for (int i = 0; i < vertexs.length; i++) {
            for (int j = 0; j < vertexs.length; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }

        //统计边数
        for (int i = 0; i < vertexs.length; i++) {
            for(int j = i+1;j < vertexs.length;j++){
                if(this.matrix[i][j] != INF){
                    edgeNum++;
                }
            }
        }
    }

    //打印领接矩阵
    public void print(){
        System.out.println("领接矩阵：");
        for (int i = 0; i < vertexs.length; i++) {
            for (int j = 0; j < vertexs.length; j++) {
                System.out.printf("%12d",matrix[i][j]);
            }
            System.out.println();
        }
    }

    //获取边放入EData数组
    private EData[] getEdges(){
        int index = 0;
        EData[] edges = new EData[edgeNum];
        for (int i = 0; i < vertexs.length; i++) {
            for (int j = i+1; j < vertexs.length; j++) {
                if(matrix[i][j] != INF){
                    edges[index++] = new EData(vertexs[i],vertexs[j],matrix[i][j]);
                }
            }
        }
        return  edges;
    }

    //对边进行排序处理
    private void sortEdges(EData[] edges){
        for (int i = 0; i < edges.length - 1; i++) {
            for (int j = 0; j < edges.length - 1 - i; j++) {
                if(edges[j].weight > edges[j+1].weight){
                    EData tmp = edges[j];
                    edges[j] = edges[j+1];
                    edges[j+1] = tmp;
                }
            }
        }
    }

    //获取下标为i的顶点的终点下标
    private int getEnd(int[] ends,int i){
        while(ends[i] != 0){
            i =ends[i];
        }

        return i;
    }

    //返回顶点下标
    private int getPosition(char ch){
        for (int i = 0; i < vertexs.length; i++) {
            if(vertexs[i] == ch){
                return i;
            }
        }
        return -1;
    }

    //核心
    public void kruskal(){
        int index = 0; //表示结果的索引
        //用于保存最小生成树
        EData[] rets = new EData[edgeNum];

        int[] ends = new int[edgeNum]; //用于保存已有最小生成树中的每个顶点在最小生成树上的终点

        //获取图中边的集合
        EData[] edges = getEdges();
        //排序
        sortEdges(edges);

        for(int i = 0;i < edgeNum;i++){
            int p1 = getPosition(edges[i].start);
            int p2 = getPosition(edges[i].end);

            //获取终点
            int m = getEnd(ends, p1);
            int n = getEnd(ends, p2);

            if(m!=n){
                ends[m] = n;
                rets[index++] = edges[i];
            }
        }
        System.out.println("最小生成树为：");
        for(int i = 0;i < index;i++){
            System.out.println(rets[i]);
        }
    }
}

class EData{
    char start; //边的一个点
    char end; //边的另外一个
    int weight; //边的权值

    public EData(char start, char end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "EData{" +
                "start=" + start +
                ", end=" + end +
                ", weight=" + weight +
                '}';
    }
}
