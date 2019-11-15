import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\apple\\Desktop\\Java\\02_Java语言进阶，13天\\day08_File类、递归\\video\\oo");
//        System.out.println(File.pathSeparator);
//        File f1 = new File("a.txt");
//        File f2 = new File(f1,"a.txt");
//        System.out.println(f1+"\n"+f2);
//
//        File f1 = new File("../LeetCode");
//        System.out.println(f.getAbsoluteFile());
//        System.out.println(f.getPath());
//        System.out.println(f.getName());
//        System.out.println(f.length());

//        System.out.println(f1.exists());

//        boolean newFile = f.createNewFile();
//        System.out.println(newFile);
//        boolean newFile1 = f.createNewFile();
//        System.out.println(newFile1);

        System.out.println(f.mkdir());
    }
}
