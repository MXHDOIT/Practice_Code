public class Suv extends Auto {

    int small = 4295;
    int mid = 5070;

    public Suv() {
    }

    public Suv(String brand, int length, int price) {
        super(brand, length, price);
    }

    @Override
    void showAuto() {
        System.out.println();
    }

    public boolean miniSuv(){
        return length <= small;
    }

    public boolean midSuv(){
        return length > small && length <= mid;
    }

    public boolean bigSuv(){
        return length > mid;
    }
}
