import java.util.*;
// print lower pyramid
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
         int num =sc.nextInt();
         int i , j ;
         for(i=num ; i>=1 ; i--){
            for(j=i ; j<num ; j++)
            System.out.print(" ");
            for(j=1 ; j<=i; j++)
            System.out.print("* ");
            System.out.println();
         }

    
    
        }
    } 

    

