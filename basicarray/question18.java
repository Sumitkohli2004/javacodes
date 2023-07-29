// package basicarray;
import java.util.*;
// convert fahrenheit to centigrade
public class question18 {
    
    public static double celsius( double f){
       double  c = (f-32)*5/9;
        return c;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        double b= sc.nextDouble();
        double a =celsius(b);
        System.out.println("temperature in celcius is"+a);
    }
}
