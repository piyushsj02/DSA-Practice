//GFG

class Solution {
    int findMaxDiff(int a[], int n) {
        Stack<Integer> st = new Stack<>();
        int[] ls = new int[n];
        int[] rs = new int[n];

        // left smaller elem calc
        for (int i = 0; i < n; i++) {
            int el = a[i];

            while (!st.isEmpty() && st.peek() >= el)
                st.pop();

            if (st.isEmpty()) {
                ls[i] = 0;
            } else {
                ls[i] = st.peek();
            }
            st.push(el);
        }

        // empty the stack
        st.clear();

        // right smaller elem calc
        for (int i = n - 1; i >= 0; i--) {
            int el = a[i];

            while (!st.isEmpty() && st.peek() >= el)
                st.pop();

            if (st.isEmpty()) {
                rs[i] = 0;
            } else {
                rs[i] = st.peek();
            }
            st.push(el);
        }

        int max = Integer.MIN_VALUE;

        // calc diff
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.abs(ls[i] - rs[i]));
        }

        return max;
    }
}