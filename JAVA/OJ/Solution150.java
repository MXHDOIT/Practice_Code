/*根据逆波兰表示法，求表达式的值。

有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。

说明：

整数除法只保留整数部分。
给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
       
       for(int i = 0;i < tokens.length;i++){
           if("+".equals(tokens[i])){
               int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1+num2);
           }else if("-".equals(tokens[i])){
               int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1-num2);
           }else if("*".equals(tokens[i])){
               int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1*num2);
           }else if("/".equals(tokens[i])){
               int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1/num2);
           }else{
               int num = Integer.parseInt(tokens[i]);
                stack.push(num);
           }
       }

       return stack.pop();
    }
}