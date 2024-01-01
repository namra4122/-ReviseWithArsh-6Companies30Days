import java.util.*;

public class GFG_NumberFollowingPattern {
    static String printMinNumberForPattern(String S) {
        // code here
        Stack<Integer> st = new Stack<>();
        String ans = "";
        int num = 1;

        for (char i : S.toCharArray()) {
            if (i == 'D') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while (!st.isEmpty()) {
                    ans += st.peek().toString();
                    st.pop();
                }
            }
        }

        st.push(num);
        while (!st.isEmpty()) {
            ans += st.peek().toString();
            st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = printMinNumberForPattern("IIDDD");
        System.out.println(s);

    }
}
