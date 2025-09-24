public class ihp1 {
    public static void inverted_half_pyramid_triangle(int n){
        int num = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j ++) {
                System.out.print(num + " ");
                    num++;
            }
            System.out.println();
            
        }
    }


    public static void rhombus( int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
           
            for (int j = 1; j <= n; j++) {
                // System.out.print("*");
                if( i == 1 ||   j == 1 || i == n || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                
             }

           
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        //inverted_half_pyramid_triangle(7);
        rhombus(8);

    }

}
