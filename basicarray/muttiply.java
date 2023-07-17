package basicarray;

import java.util.Scanner;
public class muttiply {

    public static void multiply(int[][]m){

        for(int i=0; i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
           
            System.out.print(m[i][j]+"");
        }
        System.out.println();
        }


    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the 1st row size - ");
    int row = sc.nextInt();
    System.out.println("enter the 1st column size - ");
    int col = sc.nextInt();
    System.out.println("enter number - ");
    int [][] a = new int[row][col];
   
        for(int i=0; i<a.length;i++){
        for(int j=0;j<a[0].length;j++)
        a[i][j] = sc.nextInt();
       
    }
      

    System.out.println("enter the 2nd row size - ");
    int row2 = sc.nextInt();
    System.out.println("enter the 2nd column size - ");
    int col2 = sc.nextInt();
    System.out.println("enter number - ");
    int [][] b = new int[row][col];
    
    for(int i=0; i<b.length;i++){
        for(int j=0;j<b[0].length;j++)
        b[i][j] = sc.nextInt();
   
   
   
    if(a[col]==b[row])
        System.out.println("matrix is correct - ");
         else
    System.out.println("please enter correct size -");
    }
 }
}

   
   
   
