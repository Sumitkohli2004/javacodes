// package basicarray;
// print prime no. between two given no.
import java.util.Scanner;

public class question17 {
    public static boolean isPrime(int m){
        for(int i = 2;i<m;i++){
        if(m%i==0){
            return false ;
        }
       
    } return true ;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int f = sc.nextInt();
        int l = sc.nextInt();
        for(int i=f;i<=l;i++){
            if(isPrime(i))
             System.out.print(i+" ");
        }
    }
    
}
