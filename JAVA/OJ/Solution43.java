class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        StringBuilder str1 = new StringBuilder(num1);
        StringBuilder str2 = new StringBuilder(num2);

        str1.reverse();
        str2.reverse();

        int[] arr = new int[num1.length()+num2.length()];
        
        for(int i = 0;i < num1.length();i++){
            for(int j = 0;j < num2.length();j++){
                arr[i+j] += (str1.charAt(i) - 48)* (str2.charAt(j) - 48);
            }
        }
        int cf =0;
        for(int i = 0;i < arr.length;i++){
            arr[i] = cf+arr[i];
            cf = arr[i]/10;
            arr[i] %= 10;
        }
        int len = 0;
        if(arr[arr.length-1] == 0){
            len = arr.length-2;
        }else{
            len = arr.length-1;
        }

        String str = "";

        for(int i = len;i >= 0;i--){
            str += arr[i];
        }

        return str;


    }
}