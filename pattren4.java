public class pattren4 {

     public static void main(String[] args) {
            int n = 4;
    
            // Outer loop (rows)
            for(int i = 1; i <= n; i++) {  // Fix: i should decrease from n to 1
                // Inner loop (columns)
                for(int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                
                System.out.println();  // Move to next line
            }
        }
    }
    
