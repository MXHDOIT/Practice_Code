import java.util.ArrayList;
import java.util.Arrays;
/**
 * 图
 */
public class Graph {

    ArrayList<String> list;  //用于存储节点
    int[][] map;  //用于存储边
    int numOfEdge; //边数
   //构造器

    public Graph(int n) {
        list = new ArrayList<String>(n);
        map = new int[n][n];
        numOfEdge = 0;
    }

    public static void main(String[] args) {
        int n = 8;
        String[] strs = {"1","2","3","4","5","6","7","8"};
        //创建图对象
        Graph graph=new Graph(n);
        //循环添加顶点
        for(String str:strs){
            graph.add(str);
        }

        //添加边
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(1,3,1);
        graph.insertEdge(1,4,1);

        //显示图
        graph.showGraph();
    }

    //返回节点的个数
    public int getSize(){
        return list.size();
    }

    //返回边缘的个数
    public int getEdgeNum(){
        return numOfEdge;
    }

    //遍历图
    public void showGraph(){
        for(int[] link:map){
            System.out.println(Arrays.toString(link));
        }
    }

    //添加元素
    public void add(String str){
        list.add(str);
    }

    //添加边
    public void insertEdge(int v1,int v2,int weight){
        map[v1][v2] = weight;
        map[v2][v1] = weight;
        numOfEdge++;
    }
}
