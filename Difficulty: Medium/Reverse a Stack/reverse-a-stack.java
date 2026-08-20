class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if(st.size() == 0){
            return;
        }
        int x = st.pop();
        reverseStack(st);
        insert(st, x);
    }
    
    public static void insert(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);
    }
}
