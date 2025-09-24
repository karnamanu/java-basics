public class Trailingzeros {
    public static int trailingZeros(int n ){
        int res = 0;
        int powOf5 = 5;

        while(n >= powOf5){
            res = res + (n/powOf5);
            powOf5 = powOf5 * 5;

        }
        return  res;
    }



    public static void main(String[] args) {
        int n = 10;
        System.out.println(trailingZeros(n));
        
    }
}
