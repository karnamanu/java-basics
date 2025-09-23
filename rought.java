public class rought {
    // public static int factorial(int n ){
    //     int f = 1;
    //     for(int i = 1; i <= n; i++){
    //         f *= i;
    //     }
    //     return f;
    // }
    // public static int binoCofff(int n, int r){
        

        
        
    //     int res = factorial(n) / (factorial(r) * factorial(n-r));
    //     return res;      

    // }
    // public static void main(String[] args) {
    //     int result = binoCofff(6, 3);
    //     System.out.println(result);
    // }

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        for(int [] row : arr){
            for(int j = 0; j< row.length; j++){
                row[j] = (int)(Math.random()*10);
            }
        }

        // for (int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length; j++){
        //         arr[i][j] = (int)(Math.random()*10);

        //     }
            
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j< arr[i].length;j++){
        //         System.out.print(arr[i][j] +" ");

        //     }   

        for(int [] row : arr){
            for(int num :row ){
                System.out.print(num +" ");
            }
            System.out.println();
        }
         
    }
}
