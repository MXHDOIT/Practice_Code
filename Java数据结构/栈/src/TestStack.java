public class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(9);
        s.push(8);
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.pop());
    }
}
