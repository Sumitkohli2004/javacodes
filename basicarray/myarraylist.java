package basicarray;

import java.util.*;

class datatype_store<box> {
    int default_cap = 10;
    private box[] arr;
    int size = 0;
    int last = 0;

    datatype_store() {
        arr = (box[]) new Object[default_cap];
    }

    datatype_store(int cap) {
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

    public box[] add_element() {
        System.out.println("size is exceeded , so we are doubling the array - ");
        box[] newArr = (box[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return newArr;

    }

    public void add(box element) {
        if (last == arr.length)
            add_element();

        arr[last] = element;
        last++;
        size++;
    }

    public void add_at_index(int ind, box element) {

        if (last == arr.length) {
            arr = add_element();
        }

        if (ind > last) {
            System.out.println("indexoutofbound......");
            return;
        }

        for (int i = last; i > ind; i--)
            arr[i] = arr[i - 1];

        arr[ind] = element;

        last++;
        size++;

    }

    public box remove() {
        if (last == 0) {
            System.out.println("the array is empty");
            return null;
        }
        box ls = arr[last - 1];
        arr[last - 1] = null;

        size--;
        last--;

        return ls;

    }

    public box remove_at_index(int ind) {
        if (last == 0 || ind > last) {
            if (last == 0)
                System.out.println("array is empty - ");
            else
                System.out.println("array indexout of bound - ");
            return null;
        }

        box res = arr[ind];
        for (int i = ind; i <= last; i++) {
            arr[i] = arr[i + 1];

        }
        size--;
        last--;

        return res;

    }

}

public class myarraylist {
    public static void main(String[] args) {
        datatype_store<Integer> list = new datatype_store<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
       
        list.print();
        System.out.println(" size is - " + list.size);

        // Integer el = list.remove_at_index(0);
        // list.print();
        // System.out.println("your remove element is - " + el);
        // System.out.println("size is - " + list.size);

        // list.add_at_index(3, 35);
        // list.print();
        // System.out.println(" size is - " + list.size);

        // list.remove();
        // list.print();
        // System.out.println("size is - " + list.size);

    }
}
