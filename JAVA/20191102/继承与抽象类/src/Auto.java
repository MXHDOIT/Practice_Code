public abstract class Auto {
    String brand;
    int length;
    int price;

    public Auto() {
    }

    public Auto(String brand, int length, int price) {
        this.brand = brand;
        this.length = length;
        this.price = price;
    }

    abstract void showAuto();
}
