package basicarray;
import java.util.*;
public class rotate {
    public static void printmatrix(int[][] b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
            System.out.print(b[i][j]+" ");
        }
            System.out.println();
    }
        }
      public static void rotatemat(int[][]b){
        int l=b.length;
           for(int i=0;i<b.length/2;i++){
            for(int j=i;j<b.length-i-1;j++){
                int tem = b[i][j];
                b[i][j]= b[l-j-1][i];
                 b[l-j-1][i] = b[l-i-1][l-j-1];
               b[l-i-1][l-j-1]= b[j][l-i-1];
                b[j][l-i-1]= tem;
            }
           
           }        
          System.out.println("after rotating - ");
      }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int len = sc.nextInt();
        int [][] a = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++)
                a[i][j] = (i+j+1)%10;
            
        }
        printmatrix(a);
        System.out.println();
        rotatemat(a);
        printmatrix(a);
    }
       
}
