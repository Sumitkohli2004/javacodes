import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number = ");
    int num = sc.nextInt();
    
    int st = num;
    int sp = 1;

    boolean flag = true;

    while(true){
        if(st%2==1){
            for (int i = 0; i < st; i++) {
                System.out.print("* ");
            }
            System.out.println();
            if(flag)
              st--;
            else break;  
        }else{
            for(int i=0;i<st/2;i++)
                System.out.print("* ");
            for(int j=0;j<sp;j++)
                System.out.print("  ");  
            for(int i=0;i<st/2;i++)
                System.out.print("* ");  
            System.out.println();
            if(st==2) flag=false;    
            if(flag){ 
                st-=2;
                sp+=2;
            }else{
                if(st==num-1) st++;
                else{
                st+=2;
                sp-=2;}
            }     
        }
    }
    
    }
}
