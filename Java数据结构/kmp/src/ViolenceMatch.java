public class ViolenceMatch {
    public static void main(String[] args) {
        String str1 = "ascdfasdfgh";
        String str2 = "asdfg";

        System.out.println(violenceMatch(str1,str2));
    }

    /**
     * 字符串匹配
     * @param str1
     * @param str2
     * @return 索引位置，没有返回-1
     */
    public static int violenceMatch(String str1,String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int s1Len = s1.length;
        int s2Len = s2.length;
        int i = 0; //s1的索引
        int j = 0; //s2的索引

        while(i < s1Len && j < s2Len){
            if(s1[i] == s2[j]){
                i++;
                j++;
            }else{
                i = i-(j-1);
                j = 0;
            }
        }

        if(j == s2Len){
            return i-j;
        }
        return -1;
    }
}
