// package basicarray;
// check weither a year is leap year or not.
import java.util.Scanner;

public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any year ");
        int n  = sc.nextInt();
        if(n%4==0){
            if(n%100 ==0)
            System.out.println("leap year - ");
            else
            System.out.println("not leap year - ");
        }
        else{
            if(n%4==0)
            System.out.println("its leap year  -");
            else
            System.out.println("not leap - ");
        }
    }
    
}
