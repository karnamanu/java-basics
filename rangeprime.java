public class rangeprime{
    public static boolean primeRange(int n){
        if(n <=1){
            return false;
        }
        for(int i = 2; i <=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 13;

        System.out.println("The prime numbers up to"+ n +"are:");
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(primeRange(i)){
                System.out.println(i+ " ");
            }
        }
    }

}