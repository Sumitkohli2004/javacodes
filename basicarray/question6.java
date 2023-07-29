// package basicarray;
import java.util.*;
// produce mean and median
public class question6 {
     public static int mean(int[] a){
       int sum = 0;
       for(int ele : a)
         sum+=ele;

         int result = sum/(a.length);  
       return result;
     }

     public static int median(int[] b){
        int l = b.length;
        if(b.length%2==0)
            return (b[l/2]+b[l/2-1])/2;
        
        return b[l/2];     
     }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number = ");
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int i=0;i<size;i++)
         arr[i]=sc.nextInt();
         int m = mean(arr);
       System.out.println("mean - "+m);
       int med = median(arr);
       System.out.println("median - "+med);
    }
}
