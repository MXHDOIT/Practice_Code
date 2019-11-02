abstract class A{
     int numa;

    public A(){
        this.numa = 10;
    }

    abstract void showA();
}

abstract class B extends A{
     int numb;

    public B(){
        super();
        this.numb = 20;
    }

    abstract void showB();
}

class C extends B{

     int numc;

    public C(){
        super();
        this.numc =30;
    }
    @Override
    void showA() {
        System.out.println("A = "+numa);
    }

    @Override
    void showB() {
        System.out.println("B = "+numb);
    }

    void showC() {
        System.out.println("C = "+numc);
    }
}


public class Test01 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
