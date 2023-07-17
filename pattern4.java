import java.util.Scanner;
// merge upper and lower pyramid to print a new one.
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int num = sc.nextInt();
        int i,j,k;
        for(i=1;i<=num;i++){
            for(j=num;j>i;j--)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print("* ");
            System.out.println();
              }
        for(i=num-1 ; i>=1 ; i--){
        for(j=i ; j<num ; j++)
        System.out.print(" ");
        for(j=1 ; j<=i; j++)
        System.out.print("* ");
        System.out.println();
}
}
}
     












