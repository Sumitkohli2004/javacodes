// package basicarray;

import java.util.*;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row element - ");
        int row = sc.nextInt();
        System.out.println("enter the column element -  ");
        int col = sc.nextInt();
        int [][] a  = new int[row][col];
        System.out.println("enter a element - ");
        for(int i=0; i<a.length;i++) {
            for(int j=0; j<a[0].length;j++)
                a[i][j] = sc.nextInt();    
        } 

        for(int i=0; i<a.length;i++) {
            for(int j=0; j<a[0].length;j++){
            if(i>j) System.out.print(a[i][j]+" ");
        // else System.out.print("  ");
    }    
              System.out.println();
        } 

     
    }
}