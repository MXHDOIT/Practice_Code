import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\apple\\Desktop\\Java\\黑马练习\\File类\\a.txt");

        File file1 = new File("413\\45\\89\\0202");
//        System.out.println(file);
//        System.out.println(file1);
        boolean newFile = false;
        if(!file.exists()){
            try {
                newFile  = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(newFile);
        if(!file1.exists()){
                newFile  = file1.mkdirs();
        }
        System.out.println(newFile);

//        file.delete();
//        file1.delete();

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.length());

        if(file.isFile()){
            System.out.println("是一个文件");
        }else{
            System.out.println("什么玩意");
        }

        File[] f = file1.listFiles();

        for(File a:f){
            System.out.println(a);
        }
    }
}
