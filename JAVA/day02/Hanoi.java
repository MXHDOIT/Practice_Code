public class Hanoi {
    public static void main(String[] args){
        int n = 2;
        tower(n,'x','y','z');
    }

    public static void tower(int n,char x,char y,char z){
        if(n == 1){
            move(n,x,z);
        }else {
            tower(n-1,x,z,y);
            move(n,x,z);
            tower(n-1,y,x,z);
        }

    }

    public static void move(int n,char x,char y){
        System.out.println("第"+n+"个盘子从"+x+"移到"+y);
    }

}
