import java.io.File;
import java.io.FileFilter;

public class Demo02File {
    public static void main(String[] args) {
        File file = new File("E:\\a");
        printDir(file);
    }

    public static void printDir(File dir){
//        File[] list = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                if(pathname.isDirectory()){
//                    return true;
//                }
//                if(pathname.getName().toLowerCase().endsWith(".java")){
//                    return true;
//                }
//                return false;
//            }
//        });

        File[] list = dir.listFiles(pathname -> pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java"));

        for(File x:list){
            if(x.isDirectory()){
                printDir(x);
            }else{
                System.out.println(x);
            }
        }
    }
}
