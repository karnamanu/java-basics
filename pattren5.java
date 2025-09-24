public class pattren5 {
    public static void pattren5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n-i ; j++){
                System.out.print(" ");
            
            }
            
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();  
        }
    }
    public static void main(String[] args) {
        pattren5(5);
    }
}
