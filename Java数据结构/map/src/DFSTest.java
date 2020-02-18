public class DFSTest {
    public static void main(String[] args) {
        String[] strs = {"A","B","C","D","E"};
        DFS dfs = new DFS(strs.length);
        //循环添加节点
        for (String str:strs){
            dfs.addNode(str);
        }
        //添加边
        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(1,2);
        dfs.addEdge(1,3);
        dfs.addEdge(1,4);

        //展示领结矩阵
        dfs.showGraph();
        //dfs遍历
        for(int i = 0;i < strs.length;i++){
            dfs.dfsLink(i);
            dfs.setVisited(new boolean[strs.length]);
            System.out.println();
        }
    }
}
