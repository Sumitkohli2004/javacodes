// package basicarray;
import java.util.*;
public class horizontalflip {

public static void reverse(int[] m){
   for(int i=0,j=m.length-1;i<j;i++,j--){
    int t = m[i];
    m[i] = m[j];
    m[j] = t;

   }

    
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row - ");
        int row = sc.nextInt();
        System.out.println("enter column - ");
        int col = sc.nextInt();
        System.out.println(" enter element - ");
       
        int [][] a = new int[row][col];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
            a[i][j] = sc.nextInt();
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
        } 
       
       for (int i = 0; i < a.length; i++) {
        reverse(a[i]);
       }
       
       System.out.println("Horizontally flipped- ");
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
    }       


 }
}


    

