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
                System.out.print( " "+i);
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

     public void push(box element){
        if(top == arr.length){
             addBoxs();
            System.out.println("we are increase array size - ");
        }
        arr[top] = element;
        size++;
        top++;
        }
         
        public box pop(){
            Integer x = -1;
            box res =(box) x;
            if(top == 0){
                System.out.println("Array is Empty - ");
                return res;
            }
            res = arr[top-1];
            arr[top-1] = null;
            top--;
            size--;
            System.out.println("poped element is - "+res);
            return  res;
        }

          public int peek(){
             if(top == 0){
                System.out.println("Array is Empty - ");
                return -1;
            }
            box ret = arr[top-1];
            top++;
            size++;
            System.out.println("peeked element is - "+ret);
            return (int)ret;
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

        //  st.pop();
        // System.out.println("size  after pop is - " + st.size);

        st.peek();
        System.out.println("size  after peeek  is - " + st.size);

       


    }
}
