class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length() %2 !=0) return false;
        Stack<Integer>open= new Stack<>();
        Stack<Integer>kuchbhi= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0') kuchbhi.push(i);
            else{
                if(s.charAt(i)=='(') open.push(i);
                else{
                    if(!open.isEmpty()) open.pop();
                    else if(!kuchbhi.isEmpty()) kuchbhi.pop();
                    else return false;
                }
            }
        }
        while(!open.isEmpty() && !kuchbhi.isEmpty() && kuchbhi.peek()> open.peek()){
            open.pop();
            kuchbhi.pop();
        }
        if(open.isEmpty()) return true;
        else return false;
    
    }
}