class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s: tokens){
            if("+-*/".contains(s)){
                int b = stack.pollLast();
                int a = stack.pollLast();
                switch(s){
                    case "+":
                        stack.addLast(a+b);
                        break;
                    case "-":
                        stack.addLast(a-b);
                        break;
                    case "*":
                        stack.addLast(a*b);
                        break;
                    case "/":
                        stack.addLast(a/b);
                        break;
                }
            }
            else{
                stack.addLast(Integer.parseInt(s));
            }
        }
        return stack.pollLast();
    }
}
