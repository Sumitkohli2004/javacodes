package basicarray;
import java.util.*;
public class inplacetranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter row - ");
        int row = sc.nextInt();
        System.out.println("enter column - ");
        int col = sc.nextInt();

        System.out.println("enter element - ");

        int [][] a = new int[row][col];
        for(int i=0;i<a.length;i++){
         for(int j=0;j<a[0].length;j++){
         a[i][j] = sc.nextInt();
         System.out.print(a[i][j]+" ");
         }System.out.println();
        }
         if(row!=col){
            System.out.println("enter only a square matrix");
        }else{
         


            for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[0].length;j++){
           int t = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = t;
           
             }
             
            } 
            System.out.println("after swaping");
             for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
      System.out.print(a[i][j]+" ");
        }System.out.println();
    }
       

}
}
}
