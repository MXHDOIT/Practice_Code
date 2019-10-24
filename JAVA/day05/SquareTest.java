import java.util.Scanner;

import java.util.Scanner;

class Square {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getZhouChang(){
        return (length+width)*2;
    }

    public int getArea(){
        return length*width;
    }
}


public class SquareTest {
    public static void main(String[] args) {
        Square s = new Square();
        Scanner in = new Scanner(System.in);

        s.setLength(in.nextInt());
        s.setWidth(in.nextInt());

        System.out.println(s.getArea()+"---"+s.getZhouChang());
    }
}
