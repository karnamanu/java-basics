

public class dtob {
    public static String decimalToBinary(int n){
        String b ="";
        while(n >=1){
            int x = n%2;
            n = n/2;
            b = x + b; // important if i put b + x it will print reverse

        }
        return b;
    }
    public static void main(String[] args) {
       int n = 454;
        System.out.println(decimalToBinary(n));
    }
}
