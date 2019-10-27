public class MyArrayList {
    public int numSize;
    public int[] elem;

    public final int SIZE = 10;

    public MyArrayList(){
        this.numSize = 0;
        this.elem = new int[SIZE];
    }

    //打印顺序表
    public void display(){
        for(int i = 0;i < this.numSize;i++){
            System.out.println(elem[i]+" ");
        }
    }

    //在pos位置新增元素
    public void add(int pos,int data){
        if(pos < 0 || pos > this.numSize){
            System.out.println("位置有误");
            return;
        }

        if(this.numSize == this.elem.length){
            int[] temp = new int[this.numSize*2];
            System.arraycopy(this.elem,0,temp,0,this.numSize);
            this.elem = temp;
        }

        for(int i = this.numSize-1;i >= pos;i--){
            this.elem[i+1] = this.elem[i];
        }

        this.elem[pos] = data;
        this.numSize++;
    }

    //判定是否包含某个元素
    public boolean cantains(int toFind){
        for(int i = 0;i < this.numSize;i++){
            if(elem[i] == toFind){
                return true;
            }
        }

        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i = 0;i < this.numSize;i++){
            if(this.elem[i] == toFind){
                return i;
            }
        }

        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(pos < 0 || pos > this.numSize-1){;
            return -1;
        }else{
            return elem[pos];
        }
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos,int value){

    }

    //删除第一次出现的关键字key
    public void remove(int toRemove){

        int index = search(toRemove);

        if(index == -1){
            return ;
        }

        for(int j = index;j < this.numSize-1;j++){
            this.elem[j] = this.elem[j+1];
        }
        this.numSize--;
        return ;
    }

    //获取顺序表的长度
    public int size(){
        return this.numSize;
    }

    //清空顺序表
    public void clear(){
        this.numSize = 0;
    }
}
