package basicarray;
import java.util.*;
public class matrix1 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first matrix row - ");
        int row = sc.nextInt();
        System.out.println("enter first matrix column - ");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        System.out.println("enter the element - ");
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a[0].length; j++){
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j]+" ");
    
            }
            System.out.println();
               } 
         System.out.println("enter second matrix row - ");
         int row2 = sc.nextInt();
         System.out.println("enter second matrix element - ");
         int col2 = sc.nextInt();
         int b[][] = new int[row2][col2];
         System.out.println(" enter the element - ");
         for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                a[i][j] = sc.nextInt();
                System.out.print(b[i][j]+" ");
                 }
            System.out.println();
           
        }

      }
    }
