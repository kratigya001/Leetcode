class Solution {
    public boolean isValid(String s) {
        Stack <Character> st= new Stack<Character>();
        for(char ch :s.toCharArray()){
            if(st.empty() || ch =='(' || ch=='{' || ch=='['){
                st.push(ch);
                continue;
            }
            if(ch ==')'){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch =='}'){
                if(st.peek()=='{'){
                    st.pop();
                } else{
                    return false;
                }
            }
            else if(ch==']'){
                if(st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();
        
    }
}