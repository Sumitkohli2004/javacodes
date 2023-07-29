// package basicarray;

import javax.print.attribute.standard.MediaSize.NA;

class Node {
  int data;
  Node next;

  public Node(int d) {
    this.data = d;
    this.next = null;
  }
}

public class ourlinkedlist {
  Node first = null, last = null;
  int size = 0;

  public void add(int data) {
    Node newnode = new Node(data);
    if (first == null) {
      first = newnode;
      last = newnode;
    } else {
      last.next = newnode;
      last = newnode;

    }
    size++;

  }

  public void printlist() {
    Node head = first;
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public void addfirst(int element) {
    Node newNode = new Node(element);

    if (first == null && last == null)
      first = last = newNode;
    else {
      newNode.next = first;
      first = newNode;
    }
    size++;
  }

  public void removefirst() {
    if (first == null && last == null)
      System.out.println("linked list is empty - ");
    else if (first == last) {
      first = last = null;
    } else
      first = first.next;
    size--;
  }

  public void removelast() {
    if (first == null && last == null)
      System.out.println("linked list is empty - ");
    else if (first == last) {
      first = last = null;
    } else {
      Node temp = first;
      while (temp.next != last)
        temp = temp.next;
      temp.next = null;
      last = temp;
    }
    size--;

  }

  public void add_at_index(int index, int element) {
    Node newNode = new Node(element);
    if (index > size) {
      System.out.println("index out of bound - ");
      return;
    }

    if (index == 0) {
      addfirst(element);
    } else if (index == size) {
      add(element);

    } else {
      Node temp = first;
      int i = 0;
      while (i < index - 1) {
        temp = temp.next;
        i++;
      }
      newNode.next = temp.next;
      temp.next = newNode;
      size++;
    }
  }

  public void remove_at_index(int index) {
    if (index >= size) {
      System.out.println("index out of bound - " + index);
      return;
    }
    if (index == 0)
      removefirst();
    else if (index == size)
      removelast();

    else {
      Node temp = first;
      int i = 0;
      while (i < index - 1) {
        temp = temp.next;
        i++;
      }
      temp.next = temp.next.next;
      size--;
    }
  }

  public void removefirstoccurrence(int element) {
     if(first.data==element){
       removefirst();
       return;
     }
   Node temp = first;
   Node prev = null;
    
   int f=0;
   while(temp!=null){
    if(temp.data==element){
        f=1;
        break;
      }
   prev = temp;
   temp = temp.next;
   }     
   if(f==1){
    prev.next = temp.next;
   }
   size--;
}


  public static void main(String[] args) {
    ourlinkedlist ll = new ourlinkedlist();

    // ll.add(25);
    // ll.add(30);
    // ll.add(35);
    // ll.add(40);
    // ll.add(50);
    // ll.printlist();
    // System.out.println("\n size-" + ll.size);

    // ll.addfirst(0);
    // ll.addfirst(-10);
    // ll.printlist();
    // System.out.println("\n size-" + ll.size);

    // ll.removefirst();
    // ll.printlist();
    // System.out.println("\n size-" + ll.size);

    // ll.removelast();
    // ll.printlist();
    // System.out.println("\n size-" + ll.size);

    ll.add_at_index(0, 10);
    ll.add_at_index(0, 20);
    ll.add_at_index(0, 5);
    ll.add_at_index(1, 30);
    ll.add_at_index(2, 40);
    ll.add_at_index(2, 50);
    ll.add_at_index(3, 60);
    ll.add_at_index(4, 70);
    ll.add_at_index(5, 80);
    ll.add_at_index(8, 90);
    ll.add_at_index(9, 100);
    ll.printlist();
    System.out.println("\n size-" + ll.size);
    // ll.remove_at_index(5);
    ll.removefirstoccurrence(10);
    ll.printlist();
    System.out.println("\n size-" + ll.size);
    System.out.println("this is my change");

  }
}      
