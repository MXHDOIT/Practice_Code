/* 你现在是棒球比赛记录员。
给定一个字符串列表，每个字符串可以是以下四种类型之一：
1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。

每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。
你需要返回你在所有回合中得分的总和。
*/

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0 ;i < ops.length;i++){
            String str =ops[i];
            if("+".equals(str)){
                int top = stack.pop();
                int newTop = top+stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if("D".equals(str)){
                int newTop = stack.peek()*2;
                stack.push(newTop);
            }else if("C".equals(str)){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        while(!stack.empty()){
            sum += stack.pop();
        }

        return sum;
    }
}