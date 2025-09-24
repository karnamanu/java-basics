public class Divisorgivennum {
    public static void printDivisor(int n){

        for(int i = 1 ; i * i<= n ; i ++){
            if(n % i == 0){
                System.out.println(i );
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        printDivisor(100);
    }
}
