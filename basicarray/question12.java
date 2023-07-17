package basicarray;
import java.util.*;
// find the grater no. between three given no.
public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b)
        System.out.println("number is grater"+a);
        else if(b>c)
        System.out.println("number is grater"+b);
        else if(c>a)
        System.out.println("number is grater"+c);
 }
}
