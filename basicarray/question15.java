package basicarray;
import java.util.*;
// print factorial of a number
public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("fact is ="+fact);
    }
}
