import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Arrays;
public class KMPAlgorithm {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABA";

        System.out.println(Arrays.toString(kmpNext(str2)));
    }


    //获取一个字符的部分匹配值表
    public static int[] kmpNext(String dest){
        //创建一个next数组保存部分匹配值
        int[] next = new int[dest.length()];
        next[0] = 0;

        for(int i = 1,j=0;i < dest.length();i++){
            while (j > 0&&dest.charAt(i)!=dest.charAt(j)){
                j = next[j-1];
            }
            if(dest.charAt(i)== dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
