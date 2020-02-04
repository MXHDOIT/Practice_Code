class Solution {
    public String reverseVowels(String s) {
        String str = "aoeiuAOEIU";
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            while(i <= j&&!str.contains(arr[i]+"")){
                i++;
            }

            while(i <=j&&!str.contains(arr[j]+"")){
                j--;
            }

            if(i <= j){
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }

        return new String(arr);
    }
}