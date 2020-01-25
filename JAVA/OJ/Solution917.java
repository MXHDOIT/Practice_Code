import java.lang.String;

class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<Character>();
        for(Character s:S.toCharArray()){
            if(Character.isLetter(s)){
                letters.push(s);
            }
        }

        StringBuilder str = new StringBuilder("");
        for(Character s:S.toCharArray()){
            if(Character.isLetter(s)){
                str.append(letters.pop());
            }else{
                str.append(s);
            }
        }

        return str.toString();
    }
}