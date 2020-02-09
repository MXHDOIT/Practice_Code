import java.util.Arrays;
public class HeadSort {
    public static void main(String[] args) {
        int[] tree ={2,5,3,1,10,4};
        HeadSort headSort = new HeadSort();
        headSort.head_sort(tree,tree.length);
        System.out.println(Arrays.toString(tree));
    }


    //编写交换
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /**
     * 构建堆，子树已经是堆
     * @param tree 代表树的一个数组
     * @param n 代表多少个节点【数】
     * @param i 从什么地方开始构建
     */
    public  void headify(int[] tree,int n,int i){
        if(i >= n){
            return;
        }
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;

        if(left < n && tree[left] > tree[max]){
            max=left;
        }
        if(right < n && tree[right] > tree[max]){
            max=right;
        }

        if(max!=i){
            swap(tree,max,i);
            headify(tree,n,max);
        }
    }

    //构建一个完整的堆:从下往上
    public void build_heap(int[] tree,int n){
        int last_node = n-1;
        int parent = (last_node-1)/2;

        for(int i = parent;i >= 0;i--){
            headify(tree,n,i);
        }
    }

    //堆排序
    public void head_sort(int[] tree,int n){
        build_heap(tree,n);
        int i;
        for(i = n-1;i >= 0;i--){
            swap(tree,i,0);
            headify(tree,i,0);
        }
    }
}
