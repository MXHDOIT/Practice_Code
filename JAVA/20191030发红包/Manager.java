import java.util.ArrayList;

public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> list = new ArrayList<>();

        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return list;
        }else{
            super.setMoney(leftMoney-totalMoney);

            int avg = totalMoney/count;
            int mod = totalMoney%count;

            for (int i = 0; i < count; i++) {
                if(i == count-1){
                    list.add(avg+mod);
                }else{
                    list.add(avg);
                }
            }
        }

        return list;
    }

}
