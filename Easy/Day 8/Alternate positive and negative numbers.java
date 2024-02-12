
class Solution {
    void rearrange(int arr[], int n) {

        Stack<Integer> pos = new Stack<>();
        Stack<Integer> neg = new Stack<>();
        int flag = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0)
                pos.push(arr[i]);
            else
                neg.push(arr[i]);
        }

        for (int i = n - 1; i >= 0; i--) {

            if (flag == 0 && pos.size() > neg.size()) {
                arr[i] = pos.pop();
                if (pos.size() == neg.size())
                    flag = 1;
            } else if (flag == 0 && pos.size() < neg.size()) {
                arr[i] = neg.pop();
                if (pos.size() == neg.size())
                    flag = 1;
            } else {

                if (i % 2 != 0) {
                    arr[i] = neg.pop();
                } else {
                    arr[i] = pos.pop();
                }
            }

        }

    }
}