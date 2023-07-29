// package basicarray;
// print n element in fibonacci series
import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a limit -");
        int n = sc.nextInt();
        int a=0,b=1;
        for(int i = 1;i<=n;i++){ 
            System.out.print(a+" "); 
            int temp = a+b;
            a = b; 
            b = temp ; 

        }



       
        }


    }

