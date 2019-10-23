class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int mul(){
        return this.num1*this.num2;
    }

    public int add(){
        return this.num1+this.num2;
    }

    public int sub(){
        return this.num1 - this.num2;
    }

    public int div() {
        return this.num1/this.num2;
    }


}

public class Demo2 {
    public static void main(String[] args) {
        Calculator test = new Calculator();
        test.setNum1(1);
        test.setNum2(2);

        System.out.println("add = "+test.add()+" sub = "+test.sub()+" mul = "+test.mul()+" div = "+test.div());
    }
}
