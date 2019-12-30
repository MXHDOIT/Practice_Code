class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       
        int len =  grid.length*grid[0].length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i= 0;i< grid.length;i++){
            for(int j =0;j < grid[i].length;j++){
                list.add(grid[i][j]);
            }
        }

        while(k-- > 0){
            list.add(0,list.remove(len-1));
        }

        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        int q = 0;
        for(int i = 0;i < grid.length;i++){
            List<Integer> list3 = new ArrayList<Integer>();
            for(int j  =0 ;j < grid[i].length;j++ ){
                list3.add(list.get(q++));
            }
            list1.add(list3);
        }

        return list1;
}
}