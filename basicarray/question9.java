package basicarray;
import java.util.*;
// find SI of a bank deposit
public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number - ");
        float p = sc.nextInt();
        float r = sc.nextInt();
        float t = sc.nextInt();
        float si = p*r*t/100;
        System.out.println("si of bank deposit is - "+si);
   }
}
