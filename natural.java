import java.util.*;
public class natural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        int n =scanner.nextInt();
        

        int  sum = 0;
        for( int i=0; i<=n;i++){
            sum=sum+i;
        }
        System.out.println( "the natural numbers total sum is: "+sum);
        scanner.close();
    }
}
