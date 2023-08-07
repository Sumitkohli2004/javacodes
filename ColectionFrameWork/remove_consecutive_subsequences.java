import java.util.*;

public class remove_consecutive_subsequences {

    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || st.peek() != arr[i])
                st.push(arr[i]);

            else if (arr[i] == st.peek()) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1])
                    st.pop();

            }
        }
        int[] res = new int[st.size()];
        int m = res.length;
        for (int i = m-1; i >= 0; i--) {
            res[i] = st.pop();

        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2,4};
        int[] res = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }
    }
}
