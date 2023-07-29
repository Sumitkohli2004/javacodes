// package basicarray;
// check weither a number prime no. or not
import java.util.*;

public class question16 {
    public static boolean isPrime(int m){
        for(int i = 2;i<m;i++){
        if(m%i==0){
            return false ;
        }
       
    } return true ;

    } 
    public static void main(String[] args) {
        boolean b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no - ");
        int n = sc.nextInt();
        boolean a = isPrime(n);
        System.out.print(a+  " it is a prime no -  ");
    }
    
}
