public class Euclideanlcm {
    public static int euclideanGcd(int a, int b){

        while(a != 0 && b != 0){
            if(a > b){
                a = a%b;
            }else {
                b = b%a;
            }
            
        }
        if(a != 0){
            return a ;
        }else{
            return  b;
        }
    }
    public static int euclideanLcm(int a, int b){
        return (a*b)/euclideanGcd(a,b);

    }
    public static void main(String[] args) {
        System.out.println(euclideanLcm(5, 6));
    }
 
    
}
