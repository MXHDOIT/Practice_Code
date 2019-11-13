public class TestInvokeDirect {
    public static void main(String[] args) {
        invokeDirect(()-> System.out.println("看电影"));
    }

    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
