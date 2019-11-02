public abstract class Poultry {
    private String name;
    private String symptom;
    private int age;
    private  String illness;

    public Poultry(){

    }

    public Poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void showMsg(){
        System.out.println("name = "+this.name + "，age = "+this.age+",symptom = "+this.symptom+", illness = "+this.illness);
    }

    abstract void showSymptom();
}
