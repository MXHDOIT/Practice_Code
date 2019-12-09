import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            String str = in.nextLine();
            StringBuffer str1 = new StringBuffer();
            HashSet<Character> set = new HashSet<>();
            
            for(int i = 0;i < str.length();i++){
                char ch = str.charAt(i);
                if(set.add(ch)){
                    str1.append(ch);
                }
            }
            System.out.println(str1.toString());
            
        }
    }
}