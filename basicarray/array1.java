package basicarray;
// print no using array and print the sum of given array
import java.util.*;

public class array1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number = ");
    int n = sc.nextInt();
    int sum = 0;
    int a[] = new int[n];
        for(int i=0; i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>0){
             sum = sum + a[i];
             
            } 
        }
            System.out.println(sum);
    }
}
