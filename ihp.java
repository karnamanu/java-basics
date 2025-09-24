public class ihp {
    public static void inverted_half_pyramid(int n){
        int num =1;
       for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i +1; j++) {
                System.out.print( num+ " " );
                    num++;
                

            }
            System.out.println();
       }
    }
    public static void main(String[] args) {
        inverted_half_pyramid(4);
    }
}
