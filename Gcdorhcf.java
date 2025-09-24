public class Gcdorhcf {
    public static int gcdOrHcf(int a, int b){
        //int min = 0;
        int min = ( a <b ) ? a: b;

        for( int i = min; i >=0; i--){
            if( a % i == 0 && b % i == 0){
                return i;

            }
        }
        return  1;

    }
    public static void main(String[] args) {
        System.out.println(gcdOrHcf(45, 72 ));
    }
}
