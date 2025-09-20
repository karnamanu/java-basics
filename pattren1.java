public class pattren1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;

        // outer loop 
        for(int i=1; i<=m; i++){
            //inner loop 
            for(int j=1; j<=n; j++){
                //cells(1,2)
                if (i == 1 || j == 1 ||  i == m || j == n) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
