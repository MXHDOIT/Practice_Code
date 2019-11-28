public class Test {
    public static void main(String[] args) {
        Customer cm = new Customer("乔峰");
        cm.setAccount(new Account(8888,2000,0.0125));

        cm.getAccount().deposit(1000);
        cm.getAccount().withdraw(500);
        cm.getAccount().withdraw(2000);

        System.out.println(cm);
    }
}
