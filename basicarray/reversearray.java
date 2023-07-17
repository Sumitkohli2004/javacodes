package basicarray;
import java.util.*;



public class reversearray {

    public static void printArray(int[] arr){
         for(int num : arr) 
            System.out.print(num+" ");
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size - ");
    int size = sc.nextInt();
    int [] a = new int[size];
    for(int i=0;i<size;i++)
        a[i] = sc.nextInt();

    System.out.print("original array - ");    
    printArray(a);    
    System.out.println();
    for(int i=0,j=size-1;i<j;i++,j--){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    System.out.print("reversed array - ");   
    printArray(a); 
        
        }
}
