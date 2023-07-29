// package basicarray;
import java.util.*;
// find the area and circumference of a circle
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int r = sc.nextInt();
        double a = (3.14)*r*r;
        System.out.println("area-"+a);
        double c = 2*(3.14)*r;
        System.out.println("circumference -"+c);

 }
}
