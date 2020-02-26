import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class HourseChessBoard {

    private static int X;   //棋盘的列数
    private static int Y;   //棋盘的行数
    //创建一个数组，标记棋盘的各个位置是否被访问过;二维数组转一维数组
    private static boolean visited[];
    //使用一个属性，标记是否棋盘的所有位置都被访问
    private static boolean finished;


    public static void main(String[] args) {
        System.out.println("骑士周游算法，开始运行~~");
        X = 8;
        Y = 8;

        int row = 1;
        int column =1;

        int[][] chessboard = new int[X][Y];
        visited = new boolean[X*Y];
        long start = System.currentTimeMillis();
        traversalChessboard(chessboard,row-1,column-1,1);
        long  end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"毫秒");

        //输出棋盘的最后情况
        for(int[] rows:chessboard){
            for(int step:rows){
                System.out.printf(step+"\t");
            }
            System.out.println();
        }
    }

    public static void traversalChessboard(int[][] chessboard,int row,int column,int step){
        chessboard[row][column] = step;
        visited[row*X+column] = true;

        //获取当前位置可以走的下一个位置的集合
        ArrayList<Point> ps = next(new Point(column,row));
        sort(ps);
        //遍历
        while(!ps.isEmpty()){
            Point p = ps.remove(0);
            //判断是否访问过
            if(!visited[p.y*X+p.x]){
                traversalChessboard(chessboard,p.y,p.x,step+1);
            }
        }

        if(step< X*Y && !finished){
            chessboard[row][column] = 0;
            visited[row*X+column] = false;
        }else{
            finished =true;
        }
    }

    /**
     * 根据当前位置，计算马儿还可以走那些位置，加入到ArrayList
     * @param curPoint
     * @return
     */
    public static ArrayList<Point> next(Point curPoint){
        //创建ArrayList
        ArrayList<Point> ps = new ArrayList<Point>();
        //创建一个Point
        Point p1 = new Point();
        if((p1.x = curPoint.x-2)>=0 && (p1.y = curPoint.y-1)>=0){
            ps.add(new Point(p1));
        }
        if((p1.x = curPoint.x-1)>=0 && (p1.y = curPoint.y-2)>=0){
            ps.add(new Point(p1));
        }
        if((p1.x = curPoint.x+1)< X && (p1.y = curPoint.y-2)>=0){
            ps.add(new Point(p1));
        }
        if((p1.x = curPoint.x+2)<X && (p1.y = curPoint.y-1)>=0){
            ps.add(new Point(p1));
        }
        if((p1.x = curPoint.x-2)>=0 && (p1.y = curPoint.y+1)<Y){
            ps.add(new Point(p1));
        }
        if((p1.x = curPoint.x-1)>=0 && (p1.y = curPoint.y+2)<Y){
            ps.add(new Point(p1));
        }
        if((p1.x = curPoint.x+2)<X && (p1.y = curPoint.y+1)<Y){
            ps.add(new Point(p1));
        }
        if((p1.x = curPoint.x+1)<X && (p1.y = curPoint.y+2)<Y){
            ps.add(new Point(p1));
        }
        return ps;
    }

    //根据当前这个的所有的下一步选择位置，进行非递减
    public static void sort(ArrayList<Point> ps){
        ps.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int count1 = next(o1).size();
                int count2 = next(o2).size();
                if(count1 < count2){
                    return -1;
                }else if(count1 == count2){
                    return 0;
                }else{
                    return 1;
                }
            }
        });
    }
}

