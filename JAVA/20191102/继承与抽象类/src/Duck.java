public class Duck extends Poultry{

    public Duck(){

    }

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    void showSymptom() {
        System.out.println(this.getSymptom());
    }
}
