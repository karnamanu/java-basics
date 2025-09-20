import java.util.Scanner;
public class pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();
        //pem 10  book 40

        if(cash<10){
        System.out.println("cant buy anything");
        System.out.println("need to get more cash");
        }
        else if (cash>10 && cash<40) {
            System.out.println("buy any one");
            
        }
        else{
            System.out.println("we can buy both ");
        }

        sc.close();
    }
    
}
