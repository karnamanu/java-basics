public class number1 {
    public static void main(String[] args) {
        int m =4;
        int number = 1;

        for(int i = 1; i<=m; i++){
            for( int j = 1; j<= i ;j++){
                System.out.print(  number + " ");
                number = number+3;

            }
            System.out.println();
        }
        
    }
}
