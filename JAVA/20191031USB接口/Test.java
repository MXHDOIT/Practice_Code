public class Test {
    public static void main(String[] args) {
        Laptop lt =new Laptop();

        lt.run();

        USB u = new Mouse();

        lt.useUSB(u);

        KeyBoard u1 = new KeyBoard();

        lt.useUSB(u1);

        lt.close();
    }
}
