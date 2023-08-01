package stack;

import java.util.*;

class mystack<box> {

    int default_cap = 10;
    int top;
    int size;
    int last = top;
    box arr[];

    mystack() {
        arr = (box[]) new Object[default_cap];

    }

    mystack(int cap) {
        this.default_cap = cap;
        arr = (box[]) new Object[default_cap];

    }

    public void print() {
        for (box i : arr) {
            if (i != null)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public box[] addBoxs() {

        System.out.println("size is exceeded.. so we are doubling you   r array - ");

        box[] newArr = (box[]) new Object[default_cap * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return newArr;

    }

    public void add(box element) {
        if (last == arr.length)
            addBoxs();

        arr[last] = element;
        last++;
        size++;

    }

    public void push(box element) {
        if (arr == null) {
            System.out.println("stack is null - ");
            return;
        }

        last = last + 1;
        System.out.println(" " + last);

        last++;
        size++;

    }

    public void pop(box element) {
        if (arr == null)
            System.out.println("stack is empty - ");
        return;

    }

}

public class arraylist_using_stack {
    public static void main(String[] args) {
        mystack<Integer> st = new mystack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.print();
        System.out.println("size is - " + st.size);

    }
}
