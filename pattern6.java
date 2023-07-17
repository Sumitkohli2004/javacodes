import java.util.Scanner;
// to print right pyramid
public class pattern6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number = ");
      int num = sc.nextInt(); 
      int i =1;
      int sp = num-1;
      for(i=1;i<=num;i++,sp--){
          for(int j=1;j<=sp;j++)
          System.out.print("");
          for( int j=1;j<=i; j++)
          System.out.print("*  ");
          System.out.println(); 
    }
}
}
