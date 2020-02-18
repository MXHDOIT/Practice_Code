import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DFS {
    private List<String> list;  //存储节点
    private int[][] edge;      //存储边
    private int edgeNum;      //存储边的数量
    private boolean[] visited;  //节点访问

    public void setVisited(boolean[] visited) {
        this.visited = visited;
    }

    public DFS(int n) {
        list = new ArrayList<String>(n);
        edge = new int[n][n];
        visited = new boolean[n];
    }

    //添加节点
    public void addNode(String nodeStr){
        list.add(nodeStr);
    }

    //添加边
    public void addEdge(int v1,int v2){
        edge[v1][v2] = 1;
        edge[v2][v1] = 1;
        edgeNum++;
    }

    //统计节点数
    public int nodeNum(){
        return list.size();
    }

    //统计边
    public int edgeNum(){
        return edgeNum;
    }

    //遍历图
    public void showGraph(){
        for(int[] li:edge){
            System.out.println(Arrays.toString(li));
        }
    }

    //深度搜索
    public void dfsLink(int i){
        System.out.print(list.get(i)+"->");//遍历该节点
        visited[i] = true; //说明遍历过

        for(int j = 0 ;j < list.size();j++){
            if(edge[i][j]!=0&&!visited[j]){
                dfsLink(j);
            }
        }
    }

    //得到第一个领接节点的下标
    public int getFirstNeighbor(int index){
        for(int j = 0; j < list.size();j++){
            if(edge[index][j] > 0){
                return j;
            }
        }
        return -1;
    }

    //的到下一个领接节点
    public int getNextNeightbor(int v1,int v2){
        for(int j = v2+1;j<list.size();j++){
            if(edge[v1][j]>0){
                return j;
            }
        }
        return -1;
    }


    //对一个节点的广度优先遍历方法
    private void bfs(boolean[] isVisited,int i){
        int u; //表示队列的头节点对应下标
        int w;//领接结点w
        //队列，记录节点访问的顺序
        LinkedList queue = new LinkedList();
        //访问节点，输出节点信息
        System.out.println(list.get(i)+"->");
        //标记为已访问
        isVisited[i] = true;
        //将节点加入队列
        queue.addLast(i);

        while(!queue.isEmpty()){
            //取出队列的头结点下标
            u = (Integer) queue.removeFirst();
            //得到第一个领节点的下标w
            w = getFirstNeighbor(u);
            while(w != -1){ //找到
                //是否访问过
                if(!visited[w]){ //为访问时
                    System.out.println(list.get(w)+"->");
                    //标记已经访问过
                    isVisited[w] = true;
                    //入队
                    queue.addLast(w);
                }
                w = getNextNeightbor(u,w);
            }
        }
    }

}
