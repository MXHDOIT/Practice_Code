import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;

public class Demo004FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter pw = new FileWriter("c.txt");

        char[] ch = {'A','G','H'};
        pw.write(ch);
//        pw.flush();
        pw.close();
        Scanner ne = new Scanner(System.in);
    }
}
