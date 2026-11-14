class Solution {
    public boolean isValid(String s) {
        Stack<Character> viewer = new Stack<>();
        Map<Character,Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');

        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '{' || c == '('||c == '['){
                viewer.push(c);
            }
            if(c == '}' || c == ')'||c == ']'){

                if(viewer.isEmpty()){
                    return false;
                }
                char lastOne = viewer.peek();


                char tester = pairs.get(c);


                if(lastOne == tester){
                    char previous = viewer.pop();
                }else{
                    return false;
                }
            }
        }
        return viewer.isEmpty();
    }
}
