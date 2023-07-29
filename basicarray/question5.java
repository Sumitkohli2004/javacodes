// package basicarray;
import java.util.*;
// to print the number according to array size 
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        a[i] = sc.nextInt();
        for(int i=0,j=size-1;i<j;i++,j--){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            System.out.println(" "+a[i]);
            System.out.println(" "+a[j]);
    }
    System.out.println();
  }
}
