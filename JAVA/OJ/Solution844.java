//给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();

        Stack<Character> stackT = new Stack<>();
        addStack(stackS,S);
        addStack(stackT,T);

        String strS = "";
        while(stackS.size() > 0){
            strS += stackS.pop();
        }
        String strT = "";
        while(stackT.size() > 0){
            strT += stackT.pop();
        }

        if(strS.equals(strT)){
            return true;
        }else{
            return false;
        }
    }

    private void addStack(Stack stack,String s){
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(stack.size()>0){
                   stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
    }
}