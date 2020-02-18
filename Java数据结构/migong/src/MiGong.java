import java.util.Arrays;
public class MiGong {
    public static void main(String[] args) {
        //先创建迷宫
        int[][] map = new int[8][7];
        //创建墙
        //上下用1代表墙
        for(int i = 0;i < 7;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //左右置为1
        for(int i = 0; i< 8;i++){
            map[i][0] =1;
            map[i][6] =1;
        }

        //设置挡板
        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        showMap(map);

        //走迷宫
        System.out.println("-------------------------");
        setWay(map,1,1);
        showMap(map);
    }

    /**
     * 使用递归回溯找通路
     * 用0表示未走过，1表示墙，2表示通路，3表示死路
     * @param map 表示地图
     * @param i 起始横坐标
     * @param j 起始纵坐标
     * @return
     */
    public static boolean setWay(int[][] map,int i,int j){
        if(map[6][5] == 2){
            return true;
        }else{
            if(map[i][j] == 0){ //当没有走过时
                map[i][j] = 2;  //假设已经是通路了

                //按下右上左进行测试
                if(setWay(map,i+1,j)){
                    return true;
                }else if(setWay(map,i,j+1)){
                    return true;
                }else if(setWay(map,i-1,j)){
                    return true;
                }else if(setWay(map,i,j-1)){
                    return true;
                }else{//走不通
                    map[i][j] = 3;
                    return false;
                }
            }else{ //1,2,3
                return false;
            }
        }

    }

    //遍历地图
    public static void showMap(int[][] map){
        for(int[] link:map){
            System.out.println(Arrays.toString(link));
        }
    }
}
