class fact{
    // public static int factorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //    }else{
    //         return n * factorial(n-1);
    //    }

    // }
    public static void main(String[] args) {
        //int n = 5;
        // System.out.println(factorial(5));

        int n= 5;
        int fact = 1;

        for (int i =1; i <=n; i++) {
            fact = fact * i;
            
        }
        System.out.println(fact);
    }   
}