// package basicarray;
import java.util.*;
// find the sum of digit of a given no.
public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int a,r,p,sum=0;
        a = sc.nextInt();
        int temp = a;
        while(a!=0){
         r = a%10;
         p = r*r*r;
         sum = sum+p;
         a = a/10;
        }
        if(temp==sum){
            System.out.println("this is armstrong no.- "+sum); 

        }else
        System.out.println("this is not armstrong no. - "+sum);
       





    }
}
