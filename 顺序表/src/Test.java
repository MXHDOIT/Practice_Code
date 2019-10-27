public class Test {
    public static void main(String[] args) {
    MyArrayList myarraylist = new MyArrayList();

    myarraylist.add(0,1);
    myarraylist.add(0,2);
    myarraylist.add(1,3);
    myarraylist.add(2,2);
    myarraylist.add(0,2);
    myarraylist.display();
    System.out.println("+++++++++++++++++++++++");
    myarraylist.remove(2);
    myarraylist.display();
    System.out.println(myarraylist.cantains(2));
    System.out.println("+++++++++++++++++++++++");
    myarraylist.clear();
    myarraylist.display();
    }
}
