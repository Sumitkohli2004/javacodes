package stack;

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;

    }
}

class mystack {

    Node top;
    int size;

    mystack() {
        this.top = null;
        size=0;
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println(" " + temp.data);
            temp = temp.next;

        }
        System.out.println();

    }

    public void push(int  data) {
        try{
        Node newnode = new Node(data);
        if (top == null) {
            top = newnode;
            return;
        }
        newnode.next = top;
        top = newnode;
        size++;
    }catch(Exception e){
        e.printStackTrace();
    }
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int res = top.data;
        top = top.next;
        size--;
        return res;

    }

    public int peek() {
        return (top == null) ? -1 : top.data;

    }

    public boolean isEmpty(){
            return size == 0;
        }  
   
    }




public class linkedlist_using_stack {
    public static void main(String[] args) {
        mystack st = new mystack();
        st.push(10);
        st.push(20);
        // st.push(30);
        // st.push(40);
        // st.push(50);
        // st.push(60);
        // st.push(70);
        st.print();
        System.out.println("size is - " + st.isEmpty());
        // st.pop();
        // System.out.println("size after pop - " + st.size);

    }

}
