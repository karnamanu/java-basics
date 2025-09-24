public class dimond {
    public static void dimond_pattren(int n) {
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j = 1; j <= n-i;j ++) {
                System.out.print(" ");
                
            }
            //stars
            for (int j = 1; j <= (2*i)-1; j++) {

                System.out.print("*");
                
            }
            System.out.println();
        }
        //2nd half

        for (int i = n; i >=1; i--) {
            //spaces
            for (int j = 1; j <= n-i;j ++) {
                System.out.print(" ");
                
            }
            //stars
            for (int j = 1; j <= (2*i)-1; j++) {

                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        dimond_pattren(6);
    }
}
