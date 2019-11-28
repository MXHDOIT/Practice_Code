public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }


    public void withdraw(double amount){ //取钱
        if(this.balance < amount){
            System.out.println("余额不足");
            return ;
        }

        balance -= amount;
        System.out.println("取款成功");
    }

    public  void deposit(double amount){ //存钱
        balance += amount;

        System.out.println("存款成功");
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annuallnterestRate=" + annuallnterestRate +
                '}';
    }
}
