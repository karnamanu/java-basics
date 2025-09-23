

public class btod{
    public static int binaryToDecimal(String b){
        int result = 0;
        int powof2 = 1;

        for(int  i = b.length()-1; i >=0; i--){
            if( b.charAt(i) == '1'){
                result = result + powof2;
            }
            powof2 = powof2 * 2;
        }
        return result;
    }
    public static void main(String[] args) {
        String b = "101010";
        int decimal = binaryToDecimal(b);
        System.out.println(decimal);
    }
}