package basicarray;

import java.util.Scanner;

public class transpose {

    private static void printMat(int[][] m){
              for(int i=0;i<m.length;i++){
                for(int j=0;j<m[0].length;j++)
                   System.out.print(m[i][j]+" ");
                   System.out.println();
              }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter matrix row - ");
       int row = sc.nextInt();
       System.out.println("enter matrix col -  ");
       int col = sc.nextInt();
       System.out.println("enter element - ");
       int [][] a = new int[row][col];
      
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            a[i][j] = sc.nextInt();
        } 
    }
    printMat(a);
      System.out.println(" transpose array - ");
      int [][] b = new int[col][row];
      for(int i=0;i<b.length;i++){
        for(int j=0;j<b[0].length;j++){
            b[i][j] = a[j][i];
        }
      }
     
    printMat(b);  


    }
}
