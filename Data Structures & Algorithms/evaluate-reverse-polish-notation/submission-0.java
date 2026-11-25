class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> answers = new ArrayDeque<>();
        //operation

        for(int i = 0; i < tokens.length;i++){
            if(tokens[i].equals("+")){
                 int b = answers.pop();
                 int a = answers.pop();
                 answers.push(a+b);
            }else if(tokens[i].equals("-")){
                int b = answers.pop();
                 int a = answers.pop();
                 answers.push(a-b);
            }else if(tokens[i].equals("*")){
                int b = answers.pop();
                 int a = answers.pop();
                 answers.push(a*b);
            }else if(tokens[i].equals("/")){
                int b = answers.pop();
                 int a = answers.pop();
                 answers.push(a/b);
            }else{
                answers.push(Integer.parseInt(tokens[i]));
            }
        }
        return answers.pop();
        //storage
        //check what to do
        //storage 
        //return answer

    }
}
