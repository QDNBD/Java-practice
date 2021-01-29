class Solution {
    //思路，如果遇到 ']'，就一直在栈中找到 '['，将之间的字符连接起来
    //将 '['前面的数字连接起来作为出现次数再次压栈，遇到数字、字母、'['就直接压栈，最后将栈里的字符串弹出连接起来就ok了
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == ']') {
                String string = "";
                while(!stack.peek().equals("[")) {
                    string = stack.pop() + string;
                }
                stack.pop();

                String countString = "";
                while((!stack.isEmpty()) && (stack.peek().charAt(0) >= '0' && stack.peek().charAt(0) <= '9')) {
                    countString = stack.pop() + countString;
                }
                int count = Integer.parseInt(countString);
                
                String writerstring = "";
                while(count-- > 0) {
                    writerstring = writerstring + string;
                }
                stack.push(writerstring);

            }else {
                String str = "" + s.charAt(i);
                stack.push(str);
            }
        }
        String retstring = "";
        while(!stack.isEmpty()) {
            retstring = stack.pop() + retstring;
        }
        return retstring;

    }
}