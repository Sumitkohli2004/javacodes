package basicarray;

import java.util.Scanner;

public class verticalflip {
    public static void vr(int[][]b) {
        for(int c=0;c<b[0].length;c++){
            for(int i=0,j=b.length-1;i<j;i++,j--){
            int t = b[i][c];
            b[i][c]=b[j][c];
            b[j][c]=t;

            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row - ");
        int row = sc.nextInt();
        System.out.println("enter the coloumn - ");
        int col = sc.nextInt();
        System.out.println("enter the element - ");
        int[][] a = new int [row][col];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
                
            }

           
        }
        System.out.println();

        System.out.println("the matrix is - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
           System.out.println();
           vr(a);
           System.out.println("after matrix");
           for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }       
   }
      
}
    

